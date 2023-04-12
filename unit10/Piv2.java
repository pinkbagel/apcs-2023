package unit10;

public class Piv2 {

    //π = 4(1−(1/3)+(1/5)−(1/7)+(1/9)−⋯)Leibniz

    public static double piDay(int n, boolean subtract, double pi, double denom) {
        if (n <= 0) {
            return 4*pi;
        } else {
            if (subtract) {
                pi -= 1 / denom;
            } else  {
                pi += 1 / denom;
            }
            denom += 2.0;
            return piDay(n - 2, !subtract, pi, denom);
        }
    }

    public static void main(String args[]) {
        double pi = piDay(6900, false, 0.0, 1.0);
        System.out.println("Pi = " + pi);
    }
} 