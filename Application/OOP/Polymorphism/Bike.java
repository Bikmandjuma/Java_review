package OOP.Polymorphism;

public class Bike {
    void run(){
        System.out.println("Running......");
    }    
}

class splender extends Bike{
    void run(){
        System.out.println("Vehicle is running at 10kmh");
    }

    public static void main(String[] args) {
        Bike b=new splender();
        b.run();
    }
}