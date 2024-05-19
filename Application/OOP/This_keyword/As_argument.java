package OOP.This_keyword;

public class As_argument {
    void m(As_argument obj){
        System.out.println("Method invoked !");
    }    

    void p(){
        m(this);
    }

    public static void main(String[] args) {
        As_argument a1=new As_argument();

        a1.p();
    }
}
