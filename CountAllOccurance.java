public class CountAllOccurance {
    final static int key = 3;
    static int inct = 0;

    public static int count(int arr[], int i) {
        if (i == arr.length) {
            return inct;
        }
        if (arr[i] == key) {
            inct++;
        }

        return count(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 7, 3, 8, 3 };
        System.out.println("Total No of occurance is :- " + count(arr, 0));
    }
}
