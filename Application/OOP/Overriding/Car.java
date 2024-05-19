package OOP.Overriding;

public class Car {
    void run_x(){
        System.out.println("Car is running !");
    }    
}

class Bicycle extends Car{
    void run_y(){
        System.out.println("Bicycle is running !");
    }

    public static void main(String[] args) {
        Bicycle b=new Bicycle();
        b.run_x();
        b.run_y();
    }
}
