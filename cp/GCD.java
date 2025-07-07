public class GCD {
    public static void main(String[] args) {
        int a = 56;
        int b = 98;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
