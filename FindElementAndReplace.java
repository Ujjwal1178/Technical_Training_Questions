import java.util.ArrayList;

public class FindElementAndReplace {

    static int val = 10101;

    public static ArrayList<Integer> function(int[] arg, int i, int key) {
        if (i == -1) {
            ArrayList<Integer> list = new ArrayList<>();
            return list;
        }

        ArrayList<Integer> result = function(arg, i - 1, key);
        if (arg[i] == key) {
            result.add(val);
        } else {
            result.add(arg[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 7, 3, 8, 3 };
        System.out.println(function(arr, arr.length - 1, 3));
    }
}
