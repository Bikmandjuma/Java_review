package OOP.Overriding;

public class Vehicle {
    void run(){
        System.out.println("Vehicle run well");
    }    
}

class Bike extends Vehicle{
    public static void main(String[] args) {
        Bike b=new Bike();
        b.run();
    }
}
