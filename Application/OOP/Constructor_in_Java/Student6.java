package OOP.Constructor_in_Java;
//Java Copy Constructor

public class Student6 {
    private static final String Systen = null;
    int id;
    String name;
    
    Student6(int i,String n){
        id=i;
        name=n;
    }

    Student6(Student6 s){
        id=s.id;
        name=s.name;
    }

    void display(){System.out.println(id+" "+name);}  

    public static void main(String[] args) {
        Student6 S1=new Student6(12, "Nurdin");
        Student6 S2=new Student6(S1);

        S1.display();
        S1.display();


    }

}
