package OOP.Covarient_return_type;

public class A {
    A getA(){
        return this;
    }
    
}

class B{
    B get(){
        return this;
    }

    void message(){
        System.out.println("Welcome to Covarient return type");
    }

    public static void main(String[] args) {

        B b=new B();
        new B().get().message();
    }
}
