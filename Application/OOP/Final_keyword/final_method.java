package OOP.Final_keyword;
/*
    Java final method
    If you make any method as final, you cannot override it.
*/
public class final_method {
    void run(){
        System.out.println("Running");
    }
    
}

class Honda extends final_method{
    // void run(){
    //     System.out.println("running safely with 100kmh");
    // }

    //can not override the final method

    public static void main(String[] args) {
        Honda r=new Honda();
        r.run();
    }
}

