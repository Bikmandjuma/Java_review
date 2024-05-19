package OOP.Final_keyword;
/*
    Java final class
    If you make any class as final, you cannot extend it.
*/
final class final_class {}

class Honda2 extends final_class{
    void run(){
        System.out.println("Running properly at 100 kmh !x");
    }

    public static void main(String[] args) {
        Honda2 h=new Honda2();
        h.run();
    }
}
