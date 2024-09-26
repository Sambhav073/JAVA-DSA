public class StringLength {
    public static void main(String args[]) {
        System.out.println(CalculateLength("Sambhav", "", 0));
    }

    public static int CalculateLength(String str, String newstr, int n) {

        if (str.equals(newstr)) {
            return n;
        } else {
            newstr += str.charAt(n);
        }
        int a = CalculateLength(str, newstr, n + 1);
        return a;
    }
}
