package OOP.Aggregation;

public class Employee {
    int id;
    String name;
    Address address;

    Employee(int id,String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    void display(){
       System.out.println(id+" "+name); 
       System.out.println(address.city+" "+address.state+" "+address.country); 
    }

    public static void main(String[] args) {
        Address ad1=new Address("Manhatan", "Newyork", "Country");
        Address ad2=new Address("Kariako", "DAR SALAM", "TANZANIA");

        Employee e=new Employee(12,"Bikman",ad1);
        Employee e2=new Employee(13,"Nurdin kishki",ad2);

        e.display();
        e2.display();
    }
}
