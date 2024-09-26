import java.util.*;

public class lucky_number {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                min = Math.min(matrix[i][j], min);
            }
            list1.add(min);
        }
        System.out.println(list1);
        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                max = Math.max(matrix[j][i], max);
            }
            list2.add(max);
        }
        System.out.println(list2);
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    list3.add(list2.get(j));
                }
            }
        }
        return list3;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 3, 5, 7 }, { 4, 6, 8 }, { 5, 7, 9 } };
        System.out.println(luckyNumbers(matrix));
    }
}
