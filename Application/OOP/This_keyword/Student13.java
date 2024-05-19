package OOP.This_keyword;
//Program of this() constructor call (constructor chaining) 

public class Student13 {
    int id;
    String name;

    Student13(){
        System.out.println("Default constructor is invoked !");
    }
    
    Student13(int id,String name){
        this();
        this.id=id;
        this.name=name;

    }

    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Student13 s1=new Student13(23, "Java");

        s1.display();
    }
}
