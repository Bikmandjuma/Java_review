package OOP.This_keyword;

public class Student11 {
    int id;
    String course;
    
    Student11(int id,String course){
        this.id=id;
        this.course=course;     
    }

    void display(){
        System.out.println(id+" "+course);
    }

    public static void main(String[] args) {
        Student11 s1=new Student11(23,"VueJS");

        s1.display();
    }
}
