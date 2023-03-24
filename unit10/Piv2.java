public class Piv2 {

    public static double piDay(int n, boolean subtract) {
        double pi = 0.0;
        double denom = 1.0;
        for (int x = 0; x < n; x++) {
 
            if (subtract == true) {
               pi = pi + (1 / denom);
               subtract = false;
            } else {
               pi = pi - (1 / denom);
               subtract = true;
            }
            denom = denom + 2;
         }
         pi = pi * 4;
         return pi;
    }

    public static void main(String args[]) {
         // Gregory–Leibniz
        double pi = piDay(200000000, true);
        System.out.println("Pi = " + pi);
    }
}