public class substring {
    public static void main(String args[]) {
        String str = "Hello World";
        // System.out.println(substring(str, 0, 5));
        System.out.println(str.substring(0, 5));
    }

    public static String substring(String str, int start, int end) {
        String substr = "";
        for (int x = start; x < end; x++) {
            substr += str.charAt(x);
        }
        return substr;
    }

}
