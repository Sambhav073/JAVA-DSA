import java.util.*;

public class pascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(1);
        arr.add(first);

        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            List<Integer> prev = arr.get(i - 1);
            for (int j = 1; j < prev.size(); j++) {
                temp.add(prev.get(j - 1) + prev.get(j));
            }
            temp.add(1);
            arr.add(temp);
        }
        return arr;

    }

    public static void main(String[] args) {
        System.out.println(generate(6));
    }
}