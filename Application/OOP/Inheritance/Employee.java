package OOP.Inheritance;

public class Employee {
    float salary=500000;
}

class programmer extends Employee{
    int bonus=100000;

    public static void main(String[] args) {
        programmer p=new programmer();
        System.out.println("Salary is : "+p.salary);
        System.out.println("Bonus is : "+p.bonus);
    }
}
