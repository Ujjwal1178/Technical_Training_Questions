package Recursion;

public class Factorial {
    public static int fact(int no){
        if(no== 0){
            return 1;
        }

        int factorial = no*fact(no-1);
        return factorial;
    }

    public static void fact1(int no, int factorial){
        if(no <= 1){
            System.out.println(factorial);
            return;
        }
        factorial = factorial*no;
        fact1(no-1,factorial);
    }

    public static void main(String[] args) {
        //System.out.println(fact(5));
        fact1(5,1);
    }
    
}
