package OOP.Super_keyword;
//super is used to invoke parent class constructor.

public class vehicle2 {
    vehicle2(){
        System.out.println("Vehicle is running");
    }    
}

class Bik2 extends vehicle2{
    Bik2(){
        // super();
        System.out.println("Bike is running !");
    }

    public static void main(String[] args) {
        Bik2 b=new Bik2();
    }
}
