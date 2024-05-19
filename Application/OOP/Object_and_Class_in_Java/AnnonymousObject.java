package OOP.Object_and_Class_in_Java;

public class AnnonymousObject {
    
    void factorial(int n){
        int fact=1;

        for(int i=1;i<=n;i++){
            fact=fact*i;
        }

        System.out.println("Factorial of "+n+" is "+fact);
    }

    public static void main(String[] args) {
        new AnnonymousObject().factorial(6);
    }
}
