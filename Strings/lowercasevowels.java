import java.util.*;

public class lowercasevowels {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countvowel(str));
    }

    public static int countvowel(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

            {
                c++;
            }
        }

        return c;
    }

}
