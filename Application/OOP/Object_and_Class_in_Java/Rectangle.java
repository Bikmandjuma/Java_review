package OOP.Object_and_Class_in_Java;

public class Rectangle {
    int length;
    int width;

    void insertdata(int l,int w){
        length=l;
        width=w;
    }

    void displayingData(){
        System.out.println("Length is "+length+" and width "+width);
    }

    void perimeter_of_rectangle(){
        int result = 2 * (length + width);
        System.out.println("Perimeter of rectange : "+result+" m");
    }

    void Area_of_rectangle(){
        int result = length * width;
        System.out.println("Area of rectange : "+result+" square_meter unit");
    }

    public static void main(String[] args) {
        Rectangle r1=new Rectangle();

        r1.insertdata(21,7);
    
        r1.displayingData();

        r1.perimeter_of_rectangle();

        r1.Area_of_rectangle();
    }
}
