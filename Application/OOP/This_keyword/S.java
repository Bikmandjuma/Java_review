package OOP.This_keyword;

public class S {
    String x;
    String y;

    void m(String i,String j){
        x=i;
        y=j;

        System.out.println("value of x is "+x+" and value of y is "+y);

    }

    void n(){
        this.m("Bikman", "Djuma");
    }

    void w(){
        this.n();
    }

    public static void main(String[] args) {
        new S().w();
    }
    
}
