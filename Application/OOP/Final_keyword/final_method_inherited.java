package OOP.Final_keyword;
//Ans) Yes, final method is inherited but you cannot override it. For Example:

public class final_method_inherited {
    
    final void run(){
        System.out.println("Running .....  ");
    }

}

class Honda3 extends final_method_inherited{
    public static void main(String[] args) {
        new Honda3().run();
    }
}
