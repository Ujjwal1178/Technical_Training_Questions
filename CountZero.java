package Recursion;

public class CountZero {
    public static void count(int num,int digitCount){
        if(num <= 0){
           System.out.println(digitCount) ; 
           return;
        }
        int bricks = num%10;
        if(bricks == 0){
            digitCount++;
        }

        count(num/10,digitCount);

    }

    public static void main(String[] args) {
        count(102030, 0);
    }
    
}
