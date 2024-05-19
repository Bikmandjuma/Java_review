package Java_Programs_exercises;

class Factorial{
    public static void main(String[] args){
        int n=10;

        if (n == 0) {
            System.out.println(1);
        }else{
            
            
            int fact = 1;
            for(int i = 1; i <= n; i++){
                fact= fact * i;
            }

            System.out.println(fact);
            
        }
    
    }
}