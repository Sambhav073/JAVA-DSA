import java.util.*;

public class pattern15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        upperdiamond(n);
        lowerdiamond(n);

    }

    public static void upperdiamond(int n) {
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n - x; y++) {
                System.out.print("  ");
            }
            for (int y = 1; y < x * 2; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void lowerdiamond(int n) {
        for (int x = n; x >= 1; x--) {
            for (int y = 1; y <= n - x; y++) {
                System.out.print("  ");
            }
            for (int y = 1; y < x * 2; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
