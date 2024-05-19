package OOP.Java_static_keyword;
//Program of changing the common property of all objects(static field). 

public class Student9 {
    int rollno;
    String name;
    static String college="TCT";

    static void changes(){
        college="Tumba";
    }

    Student9(int i,String n){
        rollno=i;
        name=n;
    }

    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }

    public static void main(String[] args) {
        Student9.changes();

        Student9 s1=new Student9(12,"Java");
        Student9 s2=new Student9(12,"PHP");
        Student9 s3=new Student9(12,"SQL");

        s1.display();
        s2.display();
        s3.display();
    }
}
