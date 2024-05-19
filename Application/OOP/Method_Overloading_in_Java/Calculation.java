package OOP.Method_Overloading_in_Java;
//If a class have multiple methods by same name but different parameters, it is known as Method Overloading
public class Calculation {
    
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    void sum(int x,int y){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        Calculation cal=new Calculation();
        cal.sum(12, 62, 7);
        cal.sum(3, 8);
    }
}
