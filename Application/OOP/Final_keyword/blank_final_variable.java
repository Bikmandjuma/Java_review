package OOP.Final_keyword;

public class blank_final_variable {
    final int speedLimit;

    blank_final_variable(){
        speedLimit=10;
        System.out.println(speedLimit);
    }

    public static void main(String[] args) {
        new blank_final_variable();
    }
}