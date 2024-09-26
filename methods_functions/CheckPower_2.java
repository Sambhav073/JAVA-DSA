import java.util.*;

public class CheckPower_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        while (n >= 2) {
            if (n % 2 != 0) {
                System.out.println("Not power of 2");
                c++;
                break;
            }

            n = n / 2;

        }
        if (c == 0) {
            System.out.println("yes power of 2");
        }

    }
}
