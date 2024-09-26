import java.util.*;

public class NumweicWords {
    public static void main(String args[]) {
        String Words[] = { "zero", "one", "two", "three", "four", "five", "Six", "Seven", "Eight", "nine" };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printword(Words, n, ""));

    }

    public static String printword(String Words[], int n, String str) {
        if (n == 0) {
            return str;
        }
        int a = n % 10;
        str = Words[a] + " " + str;
        return printword(Words, n / 10, str);

    }

}
