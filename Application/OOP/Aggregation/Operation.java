package OOP.Aggregation;

class Operation {
    int square(int n){
        return n*n;
    }
}

class Circle{

    double pi=3.14;
    Operation op; //Aggregation

    double area(int radius){
        op=new Operation(); 
        double rsquare=op.square(radius); //codes reusability (eg:delegates the methods call)
        return pi*rsquare;
    }

    public static void main(String[] args) {
        Circle c=new Circle();
        double result=c.area(10);
        System.out.println(result+" meter square unit");
    }
}
