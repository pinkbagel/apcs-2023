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
    public static int prob1(int a, int b){
        if (a<b) //if a is less than b
        return a; //stop and return a
        else 
        return b + prob1(a-1, b+1); //add previous b and the product of prob1 when a= a-1, b= b+1
    }

    public static int prob2(int a, int b) {
        if (a%b ==0) //when a % b is 0
        return b;//stop and return b
        else
        return prob2(b, a%b); //if not, do a % b (which is 37)
    }

    public static int prob3(int a, int b){
        if (a==0) //when a is 0
        return 1; // stop and return 1
        else
        return b*prob3(a-1,b); // returns b to the power of a because it multiplies b 
                               //and the result of prob(a-1,b) again and again until a is 0
    }

    public static void main(String[] args) {
        //Bell ringers
        System.out.println(prob1(4,2));
        System.out.println(prob2(111,74));
        System.out.println(prob3(3,3));

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