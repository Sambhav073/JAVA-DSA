public class power_oftwo {
    public static void main(String args[]) {
        System.out.println(isPowerTwo(10));
    }

    public static boolean isPowerTwo(int n) {
        return (n & (n - 1)) == 0;
    }
}
