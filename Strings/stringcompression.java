public class stringcompression {
    public static void main(String args[]) {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer c = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                c++;
                i++;
            }
            sb.append(str.charAt(i));
            if (c > 1) {
                sb.append(c.toString());
            }

        }
        return sb.toString();

    }
}
