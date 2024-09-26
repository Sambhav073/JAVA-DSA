public class factorial_numbers {
    public static void main(String args[]) {
        System.out.println(factorial_calculate(5));
    }

    public static int factorial_calculate(int n) {
        if (n == 0) {
            return 1;
        }
        // n = n * factorial_calculate(n - 1);
        // return n;
        int fm = factorial_calculate(n - 1);
        int fn = n * fm;// factorial_calculate(n - 1);
        return fn;

    }

}
