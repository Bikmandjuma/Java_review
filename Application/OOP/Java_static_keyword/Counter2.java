package OOP.Java_static_keyword;

public class Counter2 {
    static int count=0;

    Counter2(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter2 c1=new Counter2();
        Counter2 c2=new Counter2();
        Counter2 c3=new Counter2();
    }
}
