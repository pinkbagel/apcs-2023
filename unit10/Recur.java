package unit10;

public class Recur {

    public static int fun3(int n) {
        
        if (n == 0)
            return 1;
        else
            return 3 * fun3(n - 1);
    }

    public static int f(int n) {
        if (n == 0){
        System.out.println("Is 0");
            return 0;
        }
        else if (n == 1){
        System.out.println("is 1");
            return 1;
        }
        else {
        System.out.println((n-1) + "," + (n-2));
            return f(n - 1) + f(n - 2);
    }
    }

    public static boolean has(String input) {
        if (input.length() < 2)
            return false;
        return (input.charAt(0) == input.charAt(1) || has(input.substring(1)));
    }

    public static boolean pot(String input) {
        if (input.length() < 2)
            return true;
        return (input.charAt(0) == input.charAt(input.length() - 1)
                && pot(input.substring(1, input.length() - 1)));
    }

    public static double two(int n) {
        if (n < 1)
            return 1.0 / 2;
        return 1.0 / (2 + two(n - 1));
    }

    public static String mop(int n) {
        if (n / 2 == 0)
            return "" + n % 2;
        return mop(n / 2) + n % 2;
    }

    public static int cat(int x) {
        if (x == 0)
            return x;
        return ((x % 10) + cat(x / 10));
    }

    public static int mystery(int x) {
        if (x <= 1)
            return 1;
        // return mystery(x - 1) + mystery(x - 2);
        // return 2 * mystery(x - 2);
        // return 2 * mystery(x - 1);
        // return 4 * mystery(x - 4);
        return 4 + mystery(x - 1);
    }

    //Bell Ringers!
    public static int prob1(int a, int b){ //What is the output when a: 4 b: 2
        if (a<b) //if a is less than b
        return a; //stop and return a
        else 
        return b + prob1(a-1, b+1); //2 + 3(since a,b=3 and returns b + next a or b value)  + 2(since a=2, b= 4 and 2<4, returns 2) = 7
    }

    public static int prob2(int a, int b) { //What is the output when a: 111 b: 74
        if (a%b ==0) //when b fits perfectly into a
        return b;//stop and return b
        else
        return prob2(b, a%b); //return (74, 37) -> 74/37=2 so a%b==0 is true, return b which is 37
    }

    public static int prob3(int a, int b){ //What kind of function is this? test variables a: 3 b: 3
        if (a==0) //when a is 0
        return 1; // stop and return 1
        else
        return b*prob3(a-1,b); //3 * 3 (bc a=2,b=3) * 3 (a=1, b=3) = 9
                               //returns b^a
    }

    public static int mar24BellRinger(){
        int[][] mat = new int[4][3]; //4 rows, 3 columns
        for(int r = 0; r<mat.length; r++){ 
            for (int c = 0; c<mat[0].length; c++) { 
                if (r < c){
                mat[r][c]=1;
                }
                else if (r == c){ //Since r,c= 0, it returns 2 for mat[0][0]. 
                    mat[r][c] = 2;//then c increments, resulting r < c, so it returns 1 for mat[0][1]. So far there is  choice B is correct
                }
                else{
                    mat[r][c] = 3;
                }
                
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        //Bell ringers
        System.out.println(prob1(4,2));
        System.out.println(prob2(111,74));
        System.out.println(prob3(3,3));

        System.out.println(mar24BellRinger());

         //Consider function fun3
         //System.out.println(fun3(5));

        // Consider function f
         //System.out.println(f(6));

        // Consider function has
        // System.out.println(has("hello"));
        // System.out.println(has("howdy"));

        // Consider function pot
        // System.out.println(pot("deified"));
        // System.out.println(pot("deepfried"));

        // Consider function two
        // System.out.println(two(6));

        // Consider function mop
        // System.out.println(mop(11));

        // Consider function cat
        // System.out.println(cat(4096));

        // Fix function mystery so that mystery(10) == 32
        // System.out.println(mystery(10));

    }

}