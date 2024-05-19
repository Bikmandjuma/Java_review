package OOP.Final_keyword;
//final variable
/*
    Java final variable
    If you make any variable as final, you cannot change the value of final variable(It will be constant).
*/

public class Bike {
    final int speedLimit=50;
    void run(){
        // speedLimit=100; //uncomment this line ,the output will be compiler error  
        System.out.println(speedLimit);
    }

    public static void main(String[] args) {
        Bike b=new Bike();
        b.run();
    }
    
}
