package Recursion;

public class ReverseString {

    static String reverse(String str){
        if(str.length() == 1){
            return String.valueOf(str.charAt(0));
        }

        String smallresult = reverse(str.substring(1));
        return smallresult+str.charAt(0);

    }
    public static void main(String[] args) {
        
        System.out.println(reverse("ujjwal"));
    }
    
}
