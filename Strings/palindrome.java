import java.util.*;

public class palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);

        }
        System.out.println(reverse);
        if (reverse.equals(str)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

}
