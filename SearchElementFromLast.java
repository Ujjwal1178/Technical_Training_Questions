public class SearchElementFromLast {
    public static int searchElement(int arr[], int len,int key){
        // base case
        if(len == -1){
            return -1;
        }
        if(arr[len] == key){
            return len ;
        }
        return searchElement(arr, len-1, key);
    }
    public static void main(String[] args) {
        int arr[] = {5,6,8,9,9,0,3,7};
        System.out.println(searchElement(arr,arr.length-1,7));
    }
    
}
