package unit10;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Maze {
    private boolean solution;
    private char[][] maze;

    /**
     * Instantiates a Maze instance based on the provided arguments
     * 
     * @param rows the number of rows
     * @param cols the number of columns
     * @param line the values to be placed in the maze.
     */
    public Maze(int rows, int cols, String line) {
        maze = new char[rows][cols];
        solution = false;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                maze[i][j] = line.charAt(i * rows + j);
            }
        }
        // int start[] = {rows, cols};
        // String s = new String(start);
        int[] uwu = stringToInts(getStart());
        this.check(uwu[0], uwu[1]);
    }

    /**
     * @return the starting coordinates as "r c"
     */
    public String getStart() { /* Not shown, plz ignore implementation */
        int z = Arrays.stream(maze).map(String::new).collect(Collectors.joining("")).indexOf('@');
        return "" + z / maze[0].length + " " + z % maze[0].length;
    }

    /**
     * @return the ending coordinates as "r c"
     */
    public String getEnd() { /* Not shown, plz ignore implementation */
        int z = Arrays.stream(maze).map(String::new).collect(Collectors.joining("")).indexOf('$');
        return "" + z / maze[0].length + " " + z % maze[0].length;
    }

    private boolean isValid(int x, int y){
         if(x>= 0 && x<maze.length && y>=0 && y<maze[0].length){ //if in bounds
            return maze[x][y] != '#' && maze[x][y] != '%'; //% = alreaady checked place
         }
         else return false;
    }

    private int[] stringToInts(String s){
        String[] u = s.split(" ");
        int[] e = new int[2];
        e[0]= Integer.parseInt(u[0]);
        e[1] = Integer.parseInt(u[1]);
        return e;
    }

    private void setPositionAsChecked(int x, int y){
        if (x >= 0 && x < maze.length && y >= 0 && y < maze[0].length){
            maze[x][y] = '%';
        }
    }
    
    private void check(int x, int y){
        if(isValid(x,y) && !solution){
            int[] endPos = stringToInts(getEnd());
            if(x==endPos[0] && y==endPos[1]){
                solution = true;
            }
            else{
                setPositionAsChecked(x, y);
                check(x - 1, y);
                check(x + 1, y);
                check(x, y - 1);
                check(x, y + 1);
            }
        }
    }

    /**
     * Uses recursion to see if the maze has a solution or not.
     * 
     * Suggested algorithm:
     * if R and C are in bounds and spot is !#
     * - if you are at $:
     * - - set has a solution
     * - else:
     * - - mark spot as checked
     * - - recur up
     * - - recur down
     * - - recur left
     * - - recur right
     * 
     * @param r current row index
     * @param c current column index
     */
    // private void check(int r, int c) {
    //     boolean[][] visited;
    //     if ((maze[r][c] != '#') && (maze[r][c]=='$')) { //if r,c isnt # and is $
    //             hasSolution();
    //     }
    //         else if (!visited[r][c]) { //?????????????????????????
    //             visited[r][c]= true;
    //             check(r - 1, c);
    //             check(r + 1, c);
    //             check(r, c - 1);
    //             check(r, c + 1);
    //         }
    //     }

    

    /**
     * Determines if there is a solution (a path of '.') for this maze.
     * 
     * @return true if the maze has a path from Start (@) to End ($).
     */
    public boolean hasSolution() {
        return solution;

    }

    // HINT overriding toString may be handy. :)

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    public static void main(String[] args) {
        Maze example = new Maze(3, 3, "#.@.....$");
        check(example.hasSolution());

        Maze case1 = new Maze(5, 7, ".#.#....#.#.##@.....$#...#.##..#...");
        check(case1.hasSolution());

        Maze case2 = new Maze(4, 4, ".#.$.##..##.@..#");
        check(!case2.hasSolution());

        Maze test = new Maze(3, 3, "#.@.....$");
        check(test.hasSolution());

        test = new Maze(3, 3, "##@#####$");
        check(!test.hasSolution());

        test = new Maze(3, 3, "##@#..#.$");
        check(test.hasSolution());

        test = new Maze(3, 3, "#.@#.##.$");
        check(test.hasSolution());

        test = new Maze(3, 3, "##@#.##.$");
        check(!test.hasSolution());

        System.out.println("Happy Panda! \uD83D\uDC3C");

    }

}
