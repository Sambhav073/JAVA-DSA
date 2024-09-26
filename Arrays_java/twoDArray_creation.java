import java.util.*;

public class twoDArray_creation {
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = 3, m = 3;
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter " + (m * n) + " values");
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                matrix[x][y] = sc.nextInt();
            }
        }
        System.out.println("The resultant matrix: ");
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                System.out.print(matrix[x][y] + " ");
            }
            System.out.println();
        }

        System.out.println("enter value you want to search:");
        int key = sc.nextInt();
        System.out.println(search(matrix, key, m, n));
    }

    public static boolean search(int matrix[][], int key, int m, int n) {
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (matrix[x][y] == key) {

                    return true;
                }
            }

        }
        return false;
    }
}
