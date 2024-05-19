package Java_Switch;

public class SwitchExample {
    public static void main(String[] args) {
        int number=10;
        switch (number) {
            case 10:
                System.out.println(10);
                break;
            
            case 20:
                System.out.println(20);
                break;
        
            case 30:
                System.out.println(30);
                break;

            default:
                System.out.println("not in 10,20 or 30");
                break;
        }
    }
}
