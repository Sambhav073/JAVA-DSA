import java.util.*;

public class matrix_multiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter order of 1st matrix");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        System.out.println("enter elements of 1st matrix");
        int A1[][] = new int[m1][n1];
        for (int x = 0; x < m1; x++) {
            System.out.println("Enter elements of row " + (x + 1));
            for (int y = 0; y < n1; y++) {
                A1[x][y] = sc.nextInt();
            }

        }
        System.out.println("enter order of 2nd matrix");
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("enter elements of 2nd matrix");
        int A2[][] = new int[m2][n2];
        for (int x = 0; x < m2; x++) {
            System.out.println("Enter elements of row " + (x + 1));
            for (int y = 0; y < n2; y++) {
                A2[x][y] = sc.nextInt();
            }

        }

        calculate_multiplication(m1, n1, A1, m2, n2, A2);
    }

    public static void calculate_multiplication(int m1, int n1, int A1[][], int m2, int n2, int A2[][]) {
        if (n1 == m2) {
            int A3[][] = new int[m1][n2];
            for (int i = 0; i < m1; i++) {
                for (int x = 0; x < n2; x++) {
                    int a = 0;
                    for (int y = 0; y < m2; y++) {

                        a = a + A1[i][y] * A2[y][x];

                    }
                    A3[i][x] = a;

                }
            }
            System.out.println("Resultant matrix is: ");

            for (int x = 0; x < m1; x++) {
                for (int y = 0; y < n2; y++) {
                    System.out.print(A3[x][y] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("not possible");
        }
    }
}
