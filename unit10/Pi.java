public class Pi
{
    public static void main(String []args)
    {
  //      double pi = 3.0 + piCalculate(5);
        System.out.println("Pi =" + pi);
    }

    public int power(int a, int b)
    {
        //base
        if (b==1) {
            return a;
        }
        else{
            int nextPower = power(a,b); //divide the work
            if (b%2 != 0){
            return nextPower * nextPower * a;
            }
            return nextPower * nextPower;
        }
        
    } 
    
    public static double(int n, )
    for(double i=0; i<SomeNumber; i++)
    {
    if(i%2 == 0) {
        sum += -1 / ( 2 * i - 1);
    }
    else{
        sum += 1 / (2 * i - 1);
    }
}
    
}