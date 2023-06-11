public class GenerateAllPrimeNo {

    public static void printPrimeNo(int start,int end){
        if(start>end){
            return;
        }
        if(isPrime(start,2)){
            System.out.println(start);
        }
        printPrimeNo(start+1, end);
    }
    public static boolean isPrime(int no,int i){
        if(no == 2 || no == i){
            return true;
        }
        if(no <= 1 || no%i ==0){
            return false;
        }
        
        return isPrime(no, i+1);
    }
   public static void main(String[] args) {
        printPrimeNo(0, 20);
   }
}
