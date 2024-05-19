package OOP.Super_keyword;

public class vehicle {
    int speed=50;    
}

class Bike extends vehicle{
    int speed=100;

    void display(){
        System.out.println("Speed of Bike : "+speed); //display the speed of vehicle
        System.out.println("speed of vehicle : "+super.speed); //display the speed of Bike
    }

    public static void main(String[] args) {
        Bike b=new Bike();
        b.display();
    }

}