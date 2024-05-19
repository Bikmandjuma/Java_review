package OOP.Object_and_Class_in_Java;

public class Student2 {
    int rollNo;
    String name;

    void insertdata(int r,String n){
        rollNo=r;
        name=n;
    }

    void displayingInfo(){
        System.out.println(rollNo+" "+name);
    }

    public static void main(String[] args) {
        Student2 s1=new Student2();
        Student2 s2=new Student2();

        s1.insertdata(111,"Bikman");
        s2.insertdata(222,"Dilofwa");

        s1.displayingInfo();;
        s2.displayingInfo();;

    }
}
