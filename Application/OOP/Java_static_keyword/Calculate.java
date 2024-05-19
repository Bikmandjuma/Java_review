package OOP.Java_static_keyword;

public class Calculate {
    static int cube(int n){
        return n*n*n;
    }    

    public static void main(String[] args) {
        int result=Calculate.cube(6);

        System.out.println("cube of 6 is : "+result);
    }
}
