package Recursion;

public class SumOFDIgit
{
    
    
    public static int Rec(int no){
        // base case 
        if(no <= 0){
            return 0    ;
            }
            
        int ns = no%10;
        int sum = ns+Rec(no/10);
        return sum;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(Rec(12));
	}
}
