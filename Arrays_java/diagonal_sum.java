public class diagonal_sum {
    public static void main(String[] args) {
        int a[][] = {
                { 1, 2, 3, 4 },
                { 3, 1, 2, 4 },
                { 2, 3, 1, 4 },
                { 2, 3, 1, 4 } };
        int sum = 0, n = a.length;
        for (int i = 0; i < n; i++) {

            sum = sum + a[i][i];
            if (i != n - i - 1) {
                sum = sum + a[i][n - i - 1];
            }
        }
        System.out.println(sum);
    }
}
