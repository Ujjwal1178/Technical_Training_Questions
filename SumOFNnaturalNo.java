package Recursion;

public class SumOFNnaturalNo {

    public static void sum1(int no,int sum){
        if(no == 0){
            System.out.println("Sum is "+sum);
            return ;
        }
        sum = sum+no;
        sum1(no-1,sum);
    }

    public static int sum2(int no){
        if(no == 0){
            return 0 ;
        }

        int res = sum2(no-1) ;
        return res+no;
    }
    public static void main(String[] args) {
        sum1(6,0);
        System.out.println("Sum is "+sum2(3));
    }
    
}
