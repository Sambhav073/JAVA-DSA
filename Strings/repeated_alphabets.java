import java.util.*;

public class repeated_alphabets {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String ns = "";
        for (int x = 0; x < s.length(); x++) {
            int c = 0;
            for (int y = 0; y < ns.length(); y++) {
                if (ns.charAt(y) == s.charAt(x)) {
                    c++;
                }
            }
            if (c == 0) {
                ns = ns + s.charAt(x);
            }
        }
        s = ns;
        System.out.println(s);

    }

}
