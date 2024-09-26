import java.util.*;

public class spiral_2darray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows and columns:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        System.out.println("please enter " + (m * n) + " values");
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                matrix[x][y] = sc.nextInt();
            }
        }
        spiral(matrix, m, n);

    }

    public static void spiral(int matrix[][], int m, int n) {
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                System.out.print(matrix[y][x] + " ");
            }
        }
    }
}
