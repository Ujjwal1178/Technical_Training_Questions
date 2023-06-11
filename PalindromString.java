package Recursion;

public class PalindromString {
    
    public static String pal(String str){
        if(str.length() == 1){
            return String.valueOf(str.charAt(0));
        }
        String smallresult = pal(str.substring(1));
        return smallresult+str.charAt(0);

    }
    public static void main(String[] args) {
        String str = "radar";
        String str2 = pal(str);
        if(str.compareTo(str2) == 0){
            System.out.println("String is palindrom");
        }else{
            System.out.println("String is not a palindrom");
        }
       
    }
}

