public class AddStartBWSameElement {

    static String result = "";

    public static String addStar(String str, int i) {
        if (i == str.length()) {
            return result;
        }
        if (i == 0) {
            result = result + str.charAt(i);
        }
        if (i != 0) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                result = result + "*" + str.charAt(i - 1);
            } else {
                result = result + str.charAt(i);
            }
        }

        return addStar(str, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(addStar("aaabbbbcc", 0));
    }

}
