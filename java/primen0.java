import java.util.*;

public class primen0 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x = 1; x <= n; x++) {
            int c = 0;
            for (int y = 1; y <= x; y++) {
                if (x % y == 0) {
                    c++;
                }
            }
            if (c == 2) {
                System.out.println(x);
            }
        }
    }

}
