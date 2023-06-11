import java.util.Arrays;

public class SumOfOddEvenPosition {

    static int[] SumEvenOdd(int num, int pos){
        //base case
        if(num == 0){
            int result[] = new int[2];
            return result;
        }

        int arr[] = SumEvenOdd(num/10,pos+1);
        int digit = num%10;
        if(pos % 2 != 0){
            arr[0]= arr[0]+digit;
        }else{
            arr[1] = arr[1]+digit;
        }
        return arr;
    }

    public static void main(String[] args) {
    int arr[] = SumEvenOdd(19345,0 );
    System.out.println(arr[0]+" "+arr[1]);
    Arrays.sort(arr);
    System.out.println(arr[0]+" "+arr[1]);
    }
}
