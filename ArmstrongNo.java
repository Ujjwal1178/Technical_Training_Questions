package Recursion;

public class ArmstrongNo {

    public static int armstrong(int no, int i,int sum){
        if(no == 0){
            
            return sum  ;
        }
        sum = sum+(int)Math.pow(no%10,i) ;
        return armstrong(no/10,i,sum ); 
    }    
    public static void main(String[] args) {
        int no = 153;
        int val = armstrong(no,3,0) ;
        System.out.println((val==no)?"Its an armstrong no" : "Its not an armstrong no");
    }
}
