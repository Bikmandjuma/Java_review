package OOP.Constructor_in_Java;

public class Student5 {
    int id;
    String name;
    int age;
    
    Student5(int i,int a){
        id=i;
        age=a;
    }

    Student5(int i,String n,int a){
        id=i;
        name=n;
        age=a;
    }

    void display(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        Student5 s1=new Student5(1,41);
        Student5 s2=new Student5(2,"Kishki",41);

        s1.display();
        s2.display();
    }

}
