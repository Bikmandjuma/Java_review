package OOP.Polymorphism;

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

class Test{
    public static void main(String[] args) {
        Bank s=new SBI();
        Bank s1=new ICICI();
        Bank s2=new AXIS();

        System.out.println("Rate of interest of SBI is "+s.getRateOfInterest());
        System.out.println("Rate of interest of ICICI is "+s1.getRateOfInterest());
        System.out.println("Rate of interest of AXIS is "+s2.getRateOfInterest());
    }
}
