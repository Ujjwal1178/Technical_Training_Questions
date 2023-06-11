public class removaDuplicate {

    static String result = "";

    public static String duplicate(String str, int i) {
        if (i == str.length() - 1) {
            return result;
        }

        if (str.charAt(i) == str.charAt(i + 1)) {
            result = result + str.charAt(i);
        }
        return duplicate(str, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(duplicate("aabbcc", 0));
    }
}