import java.util.*;

public class fibonnacievensum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number[] = new int[n];
        int a = 0;
        int b = 1;
        number[0] = a;
        number[1] = b;
        int sum = 0;
        if (n == 1) {
            number[n - 1] = a;
        } else if (n == 2) {
            sum = b;
        } else {
            for (int x = 2; x < n; x++) {
                number[x] = a + b;
                a = b;
                b = number[x];

            }
        }
        for (int x = 1; x <= n; x++) {

            if (x % 2 == 0) {
                sum = sum + number[x - 1];
            }

            System.out.print(number[x - 1] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}