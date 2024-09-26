import java.util.*;

public class spiral_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                System.out.print(Math.max(Math.max(x, y), Math.max(n - y + 1, n - x + 1)));
            }

            System.out.println();

        }

    }
}
