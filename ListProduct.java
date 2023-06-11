import java.util.ArrayList;

public class ListProduct {

    public static int product(ArrayList<Integer> list,int i,int length){
        if(i == list.size()){
            return length;
        }
         length = length*list.get(i);
       
       int result = product(list,i+1,length);
        return result;
    }

    public static int product2(ArrayList<Integer> list,int i){
        if(i == list.size()){
            return 1;
        }
        int length = list.get(i);
        int prod = product2(list,i+1);
        prod = prod*length ;
        return prod;
    }
    public static void main(String[] args) {
        
       ArrayList<Integer> list = new ArrayList<>();
       list.add(3);list.add(5);list.add(7);
       System.out.println(product(list,0,1));
       System.out.println(product2(list,0));
    }
    
}
