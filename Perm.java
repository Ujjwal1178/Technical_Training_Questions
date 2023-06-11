import java.util.ArrayList;

public class Perm {
    
    public static ArrayList<String> getperm(String str){
        // base case
        if(str.length() == 0){
            ArrayList<String> l = new ArrayList<>();
            l.add("");
            return l;
        }
        //first char
        char firstChar = str.charAt(0);
        ArrayList<String> finalList = new ArrayList<>();
        ArrayList<String> result = getperm(str.substring(1));
        for(String s : result){
            for(int i = 0 ; i <= s.length() ; i++){
                StringBuilder sb = new StringBuilder(s);
                sb.insert(i,firstChar);
                finalList.add(sb.toString());
            }
        }
        return finalList;
    }

    public static void main(String[] args) {
        System.out.println(getperm("abc"));
    }
}
