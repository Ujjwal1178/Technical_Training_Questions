package Recursion;

public class PowerOfNumber {

    public static int power(int no, int pow){
        if(pow == 1){
            return no;
        }

        int result = no*power(no,pow-1) ;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
    
}
