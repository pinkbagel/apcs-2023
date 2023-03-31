package unit10;

public class Piv2 {

    // π = 4(1−(1/3)+(1/5)−(1/7)+(1/9)−⋯)

    public static double piDay(int n, boolean subtract, double pi, double denom) {
        if (n == 0) {
            pi = 4 * (1 - 1 / denom);
        } else {
            if (subtract) {
                pi -= 1 / denom;
                denom += 2.0;
                return piDay(n - 2, !subtract, pi, denom);
            } else if (!subtract) {
                pi += 1 / denom;
                denom += 2.0;
                return piDay(n - 2, !subtract, pi, denom);

            }
        }
        return pi = 4 * (1 - 1 / denom);
    }

    public static void main(String args[]) {
        double pi = piDay(68, false, 0.0, 1.0);
        System.out.println("Pi = " + pi);
    }
}