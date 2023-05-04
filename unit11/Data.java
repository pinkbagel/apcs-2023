package unit11;

//2022 FRQ #4
// https://apcentral.collegeboard.org/media/pdf/ap22-frq-computer-science-a.pdf#page=14
public class Data {
    public static final int MAX = 888; /* value not shown */;
    private int[][] grid;

    public Data(int r, int c) {
        grid = new int[r][c];
    }

    public Data(int[][] grid) {
        this.grid = grid;
    }

    /**
     * Fills all elements of grid with randomly generated values, as described in
     * part (a)
     * Precondition: grid is not null.
     * grid has at least one element.
     */
    public void repopulate() {
        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[r].length; c++){
                int x = (int)(Math.random()*MAX)+1;
                while (x%10 !=0 || x%100 == 0){
                    x = (int)(Math.random()*MAX)+1;
                }
                grid[r][c]= x;
            }
        }

    }

    /**
     * Returns the number of columns in grid that are in increasing order, as
     * described
     * in part (b)
     * Precondition: grid is not null.
     * grid has at least one element.
     */
    public int countIncreasingCols() {
        int num = 0;
        for(int c=0; c<grid[0].length-1; c++){
            boolean y=true;
            for(int r=0; r<grid.length-1; r++){
                if(grid[r][c]>grid[r+1][c]){
                    y=false;
                }
            }
            if(y){
                num++;
            }
        }
        return num;
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    public static void main(String[] args) {
        Data one = new Data(7, 11);
        one.repopulate();
        for (int[] line : one.grid) {
            for (int val : line) {
                check(val <= MAX);
                String repr = String.valueOf(val);
                check(repr.endsWith("0") && !repr.endsWith("00"));
            }
        }

        int[][] foo = { { 10, 50, 40 }, { 20, 40, 20 }, { 30, 50, 30 } };
        check(new Data(foo).countIncreasingCols() == 1);

        int[][] three = { { 10, 540, 440, 440 }, { 220, 450, 440, 190 } };
        check(new Data(three).countIncreasingCols() == 2);

        System.out.println("Happy Panda! \uD83D\uDC3C");

    }
}