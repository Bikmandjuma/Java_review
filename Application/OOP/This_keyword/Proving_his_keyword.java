package OOP.This_keyword;

public class Proving_his_keyword {
    void m(){
        System.out.println("Reference no in m method : "+this);
    }

    public static void main(String[] args) {
        Proving_his_keyword p=new Proving_his_keyword();
        System.out.println("Reference no in main method : "+p);

        p.m();
    
    }
}
