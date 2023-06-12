import java.util.ArrayList;

public class MazePathProblem {

    public static ArrayList<String> getmaze(int currRow, int currCol, int endCol, int endRow) {
        if (currRow == endRow && currCol == endCol) {
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }

        if (currRow > endRow || currCol == endCol) {
            ArrayList<String> result = new ArrayList<>();
            return result;
        }
        ArrayList<String> finalResult = new ArrayList<>();

        ArrayList<String> rightMove = getmaze(currRow, currCol + 1, endCol, endRow);
        for (String t : rightMove) {
            finalResult.add("R" + t);
        }

        ArrayList<String> downMove = getmaze(currRow + 1, currCol, endCol, endRow);
        for (String t : downMove) {
            finalResult.add("D" + t);
        }
        return finalResult;
    }

    public static void main(String[] args) {
        ArrayList<String> result = getmaze(0, 0, 2, 2);
        System.out.println(result);
    }
}
