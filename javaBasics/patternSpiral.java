import java.util.*;

public class patternSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n * 2 - 1 - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= n - i + 1; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= k; j++) {
                System.out.print(n - i + 1);
            }
            if (i != n) {
                for (int j = n - i + 1; j <= n; j++) {
                    System.out.print(j);
                }
            } else {
                for (int j = n - i + 2; j <= n; j++) {
                    System.out.print(j);
                }
            }
            System.out.println();
            k = k - 2;
        }
        k = 1;
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > n - i + 1; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= k; j++) {
                System.out.print(n - i + 1);
            }
            if (i != n) {
                for (int j = n - i + 2; j <= n; j++) {
                    System.out.print(j);
                }
            } else {
                for (int j = n - i + 2; j <= n; j++) {
                    System.out.print(j);
                }
            }
            System.out.println();
            k = k + 2;
        }
    }
}