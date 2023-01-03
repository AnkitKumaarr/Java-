import java.util.ArrayList;

public class MazePath {
    static ArrayList<String> maze(int currentRow, int currentCol, int row, int column) {
        // positive baseCase
        if (currentRow == row && currentCol == column) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        // negative baseCase
        if (currentRow > row || currentCol > column) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> horizontal = maze(currentRow, currentCol + 1, row, column);
        for(String s : horizontal){
            result.add("H" + s);
        }

        ArrayList<String> vertical = maze(currentRow + 1, currentCol, row, column);
        for(String s : vertical){
            result.add("V" + s);
        }
      
        return result;

    }
        public static void main(String[] args) {
        ArrayList<String> res = maze(1, 1, 3, 3);
        System.out.println(res);
    }
}