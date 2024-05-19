package OOP.This_keyword;
// Where to use this() constructor call?

public class Student14 {
    int id;
    String city;
    static String country="Tanzania";


    Student14(int id,String city){
        this.id=id;
        this.city=city;
    }

    Student14(int id,String city,String country){
        this(id,city);
    }

    void display(){
        System.out.println(id+" "+city+" "+country);
    }

    public static void main(String[] args) {
        Student14 s1=new Student14(12, "Kigali");
        s1.display();
    }


}
