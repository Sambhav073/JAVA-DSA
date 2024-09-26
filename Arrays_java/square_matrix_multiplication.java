import java.util.*;

public class square_matrix_multiplication {
    public static void main(String[] args) {
        int A1[][] = new int[2][2];
        int A2[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of 1st matrix");
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                A1[x][y] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of 2nd matrix");
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                A2[x][y] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < 2; x++) {
                int sum = 0;
                for (int y = 0; y < 2; y++) {
                    sum = sum + A1[x][y] * A2[y][x];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }

}
