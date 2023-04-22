package unit11.b;

/**
 * Did you know that Bats are really loud? You just can't hear them!
 * https://www.scientificamerican.com/article/how-do-bats-echolocate-an/
 */
public class Bat {

    public void conditionalTest(int a, int b) {
        if ((a > 0) && (b > 0)) {
            if (a > b)
                System.out.println("A");
            else
                System.out.println("B");
        } else if ((b < 0) || (a < 0))
            System.out.println("C");
        else
            System.out.println("D");
    }

    // what is the output of conditionalTest(3,-2)?
    //   C
    // how much of this function do we need to inspect?
    // two parts (the first if statment then else if)

    private int[] arr;

    // precondition : arr.length > 0
    public void mystery() {
        int s1 = 0;
        int s2 = 0;
        for (int k = 0; k < arr.length; k++) {
            int num = arr[k];
            if ((num > 0) && (num % 2 == 0))
                s1 += num;
            else if (num < 0)
                s2 += num;
        }
        System.out.println(s1);
        // System.out.println(s2);
    }
    // what does mystery() do to s1?
    //add 1 to num every time arr[k] is bigger than 0 and even

    public static void main(String[] args) {
        // why do we need to instantiate a Bat?
        // since conditionalTest is not static, you cant call conditionalTest without b
        Bat b = new Bat();
        // b.conditionalTest(3, -2);

        // invent an array
        // int arr[] = { -9, 7, 2, -8, 6, 5, 1 };
        // b.arr = arr;
        // b.mystery();
    }

}
