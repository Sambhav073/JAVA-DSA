import java.util.*;

public class diagonal_elements_2d_sum {
    public static int diagonalsum(int numbers[][]) {
        int sum = 0;
        // time complexity O(n^2)
        // for (int x = 0; x < numbers.length; x++) {
        // for (int y = 0; y <= numbers[0].length; y++) {
        // if (x == y || x + y == numbers.length - 1) {
        // sum = sum + numbers[x][y];
        // }
        // }
        // }
        // time complexity O(n)
        for (int x = 0; x < numbers.length; x++) {
            sum = sum + numbers[x][x];
            if (x != numbers.length - x - 1) {
                sum += numbers[x][numbers.length - 1 - x];
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numbers[][] = new int[4][4];
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                numbers[x][y] = sc.nextInt();
            }
        }
        System.out.println(diagonalsum(numbers));
    }
}