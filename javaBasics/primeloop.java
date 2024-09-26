import java.util.*;

public class primeloop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        int c = 0;
        for (int x = 1; x <= a; x++) {
            if (a % x == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println("prime number");
        } else {
            System.out.println("not a prime number");
        }
    }

}
