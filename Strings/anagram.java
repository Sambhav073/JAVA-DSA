import java.util.*;

public class anagram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (str1.length() == str2.length()) {
            System.out.println(check(str1, str2));
        } else {
            System.out.println("not anagrams");
        }
    }

    public static String check(String str1, String str2) {

        for (int i = 0; i < str1.length(); i++) {
            int c = 0;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    c++;
                }
            }
            if (c == 0) {
                return "not anagrams";
            }

        }
        return "anagrams";
    }
}
