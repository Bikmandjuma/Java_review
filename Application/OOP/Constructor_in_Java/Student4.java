package OOP.Constructor_in_Java;

public class Student4 {
    int id;
    String name;

    Student4(int i,String n){
        id=i;
        name=n;
    }

    void display(){
        System.out.println("id is : "+id+" "+"name is : "+name);
    }

    public static void main(String[] args) {
        Student4 stu1=new Student4(1,"Bikman");
        Student4 stu2=new Student4(2,"Nurdin");

        stu1.display();
        stu2.display();
    }
}
