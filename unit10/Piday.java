public class Piday
{
    public static void main(String []args)
    {
        System.out.println(fibonacci(1));
        System.out.println(power(2,3));
    }

    static double piCalculate(int n)
    {
        int x = 0;
        
        for (int i = 1; i< n; i+=2){
            x = 2;
            double pi = 4/(x*x+1*x+2);
            if (i/2 == 1){
                for (int j = 1; j< n; j+=2){
                    pi = pi - 4/(x+2*x+4*x+6);
            }
       }
        return pi;
    }
   static int factorialIter(int n)
   {
     int result = 0;
     for (int i = n; i <= 1; i++){
      result *= 1;
     }
     return result;
   }

   
   static int factorialRec(int n)
   {
      //base case
      if (n == 1){
        return 1;
      }
      //recursive
      return n*factorialRec(n-1);
   }


    static int fibonacci(int n)
    {
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fibonacci(n-1)+ fibonacci(n-2);
    }

 //   static String reverse(String input)
 //   {
 //       if (input.length()==1){
 //           return input;
 //       }
 //       String head = input.substring(beginIndex: 0, endIndex: 1);
 //       String tail = input.substring(behinIndex: 1);
 //       return reverse(tail) + head;
 //   }
}
      
      