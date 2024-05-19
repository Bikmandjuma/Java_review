package OOP.Overriding;

public class Bank {
    int getRateOfInterest(){
        return 0;
    } 
}

class SBI extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}

class ICICI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}

class AXIS extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}

class Test2{
    public static void main(String[] args) {
        
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS A = new AXIS();

        System.out.print("SBI Interest is : "+s.getRateOfInterest()+"\n");
        System.out.print("ICICI Interest is : "+i.getRateOfInterest()+"\n");
        System.out.print("AXIS Interest is : "+A.getRateOfInterest()+"\n");

    }
}
