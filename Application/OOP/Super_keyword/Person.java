package OOP.Super_keyword;
//super can be used to invoke parent class method

public class Person {

    void message(){
        System.out.println("Person created in super class !");
    }
    
}

class Student extends Person{

    void message()
    {
        System.out.println("Student created in subclass");
    }

    void display(){
        message();;
        super.message();
    }

    public static void main(String[] args) {
        Student s=new Student();
        s.display();
    }
}
