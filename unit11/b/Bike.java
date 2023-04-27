package unit11.b;

class Vehicle extends Object{
    private int numWheels;

    public Vehicle(int numWheels) {
        this.numWheels = numWheels;
    }

    public String toString() {
        return this.getClass().getName() + " with " + numWheels + " wheels";
    }
}

// Code me! bikes have 2 wheels
public class Bike extends Vehicle {
    public Bike(){
        super(2);
    }
    public static void main(String []args){
        Bike bike = new Bike();
        System.out.println(bike.toString());
    }
}
