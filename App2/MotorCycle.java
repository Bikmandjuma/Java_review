public class MotorCycle {
    String make;
    String color;
    boolean EngineState;

    void test(){
        if (EngineState == true) {
            System.out.println("motorcycle is "+make+" "+color);
        }
    }

    public static void main(String[] args) {
        MotorCycle m = new MotorCycle();
        m.make="Yamaha RZ234";
        m.color="Yellow";
        System.out.println("Call test method");
        m.test();       
    }
    
}

