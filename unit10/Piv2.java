package unit10;
public class Piv2 {

//π = 4(1−(1/3)+(1/5)−(1/7)+(1/9)−⋯)
//I made a function without the for loop previously but the outputs were way off, so I added a loop inside. Is this okay?

    public static double piDay(int n, boolean subtract) {
        double pi = 0.0;
        double denom = 1.0;
        if (n == 0) {
            pi = 4*(1-1/denom);
        }
        else {
            for (int i = 0; i < n; i++){
                if (subtract == true) {
                    pi -= 1/denom;
                }
                else if (subtract == false){
                    pi += 1/denom;
                }
            denom += 2.0;
            subtract= !subtract;

            }   
            pi *= 4;
        }
        return pi;
    }

    public static void main(String args[]) {
        double pi = piDay(99999, false);
        System.out.println("Pi = " + pi);
    }
}