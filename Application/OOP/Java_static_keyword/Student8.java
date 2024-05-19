package OOP.Java_static_keyword;
//Program of static variable

public class Student8 {
    int rollno;
    String name;
    static String college="TCT";

    Student8(int i,String n){
        rollno=i;
        name=n;
    }

    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }

    public static void main(String[] args) {
        Student8 s1=new Student8(12,"Quaresma");
        s1.display();
    }
}
