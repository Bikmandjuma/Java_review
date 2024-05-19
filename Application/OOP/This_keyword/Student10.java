package OOP.This_keyword;

public class Student10 {
    int id;
    String name;
    
    Student10(int id,String name){
        //use This_keyword in this block
        
        // this.id=id;
        // this.name=name;

        id=id;
        name=name;
    }

    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Student10 s1=new Student10(2, "Javascript");
        Student10 s2=new Student10(4, "Java");

        s1.display();
        s2.display();
    }
}
