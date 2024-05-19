package OOP.This_keyword;

public class A {
    A getA(){
        return this;
    }    

    void msg(){
        System.out.println("Hello java");
        
    }

    public static void main(String[] args) {
        A a=new A();
        a.msg();
    }
}
