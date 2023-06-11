import java.util.*;

public class MultiplyToItself {

    public static ArrayList<Integer> productsol(int arr[], int i) {
        if (i == -1) {
            ArrayList<Integer> list = new ArrayList<>();
            return list;
        }

        ArrayList<Integer> result = productsol(arr, i - 1);
        result.add((int) Math.pow(arr[i], 2));
        return result;
    }

    public static void main(String[] arg) {
        Integer[] arr = { 1, 2, 3, 6, 7 };

        System.out.println(productsol(arr, arr.length - 1));
    }
}
