package OOP.Super_keyword;
//Program in case super is not required

public class Person2 {
    void message(){
        System.out.println("Person created in super class !");
    }    
}

class Student5 extends Person2{
    void display(){
        message();
    }

    public static void main(String[] args) {
        Student5 stu=new  Student5();
        stu.display();
    }
}
