import java.util.*;

public class Spiral_Matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numbers[][] = new int[4][4];
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                numbers[x][y] = sc.nextInt();
            }
        }
        print_spiral(numbers);

    }

    public static void print_spiral(int numbers[][]) {
        int start_row = 0;
        int start_column = 0;
        int end_row = 3;
        int end_column = 3;
        while (start_row <= end_row && start_column <= end_column) {
            for (int y = start_column; y <= end_column; y++) {
                System.out.print(numbers[start_row][y] + " ");
            }
            for (int x = start_row + 1; x <= end_row; x++) {
                System.out.print(numbers[x][end_column] + " ");
            }
            for (int y = end_column - 1; y >= start_column; y--) {
                System.out.print(numbers[end_row][y] + " ");
            }
            for (int x = end_row - 1; x >= start_row + 1; x--) {
                System.out.print(numbers[x][start_column] + " ");
            }
            start_row++;
            start_column++;
            end_row--;
            end_column--;
        }

    }

}
