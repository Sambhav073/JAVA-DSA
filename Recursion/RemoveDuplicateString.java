public class RemoveDuplicateString {
    public static void main(String args[]) {
        boolean map[] = new boolean[26];
        StringBuilder newstr = new StringBuilder("");
        RemoveDuplicate("sambhav", 0, newstr, map);

    }

    public static void RemoveDuplicate(String s, int n, StringBuilder newstr, boolean map[]) {
        if (n == s.length()) {
            System.out.println(newstr);
            return;
        }
        char currChar = s.charAt(n);
        if (map[currChar - 'a'] == true) {
            RemoveDuplicate(s, n + 1, newstr, map);
        } else {
            map[currChar - 'a'] = true;
            RemoveDuplicate(s, n + 1, newstr.append(currChar), map);
        }

    }

}
