import java.util.ArrayList;

public class DiceBoard {

    public static void getDicePat(int sFb, int fBd, String result) {

        // termination case which returns the value
        if (sFb == fBd) {
            System.out.print(result + " ");
        }
        if (sFb > fBd) {
            return;
        }

        // dice turns
        for (int dice = 1; dice <= 6; dice++) {
            int newValue = sFb + dice;
            getDicePat(newValue, fBd, result + dice);
        }
    }

    public static ArrayList<String> getDicePat2(int total, int goal) {
        // termination case
        if (total == goal) {
            ArrayList<String> l1 = new ArrayList<>();
            l1.add("");
            return l1;
        }
        if (total > goal) {
            ArrayList<String> l2 = new ArrayList<>();
            return l2;
        }

        ArrayList<String> finalResult = new ArrayList<>();
        // dice turns

        for (int dice = 1; dice <= 6; dice++) {
            ArrayList<String> list = getDicePat2(total + dice, goal);
            for (String s : list) {
                finalResult.add(s + dice);
            }
        }
        return finalResult;
    }

    public static void main(String[] args) {
        // getDicePat(0, 10, "");
        ArrayList<String> result = getDicePat2(0, 3);
        System.out.println(result);
    }
}
