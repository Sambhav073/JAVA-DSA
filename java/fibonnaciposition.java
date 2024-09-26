import java.util.*;
public class fibonnaciposition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        int sum = 0;
        if (n == 1) {
            sum = -1;
        } else if (n == 2) {
            sum = 0;
        } else {
            for (int x = 1; x <= n - 2; x++) {
                c = a + b;
                if (x % 2 == 0) {
                    sum = sum + c;
                }
                a = b;
                b = c;
            }

        }
        System.out.println(sum + 1);
    }

}
