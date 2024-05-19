package OOP.Super_keyword;

public class Car {
    Car(){
        System.out.println("Car created !");
    }    
}

class Bike6 extends Car{
    int speed;
    Bike6(int speed){
        this.speed=speed;
        System.out.println("Speed of "+speed);
    }

    public static void main(String[] args) {
        Bike6 b=new Bike6(10);

    }
    
}
