package OOP.Inheritance;

public class A {
    void msg(){
        System.out.println("Class A");
    }
}

class B {
    void msg2(){
        System.out.println("Class B");
    }
}

class C extends B {
    public static void main(String args[]){
        C obj=new C();

        // obj.msg();
        obj.msg2();
    }
    
}

