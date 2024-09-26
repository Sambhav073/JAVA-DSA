public class x_to_power {
    public static void main(String args[]) {
        System.out.println(calPower(2, 5));
    }

    // public static int calPower(int x, int n) {
    // // if (n == 1) {
    // // return x;
    // // }
    // if (n == 0) {
    // return 1;
    // }
    // int ans = x * calPower(x, n - 1);
    // return ans;
    // }

    // OPTIMISED
    public static int calPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int ans = calPower(x, n / 2);
        ans = ans * ans;

        if (n % 2 != 0) {
            ans = x * ans;
        }
        return ans;

    }

}
