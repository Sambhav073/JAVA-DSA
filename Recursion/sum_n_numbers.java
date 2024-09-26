public class sum_n_numbers {
    public static void main(String args[]) {
        System.out.println(calsum(3));
    }

    public static int calsum(int n) {
        if (n == 1) {
            return n;
        }
        n = n + calsum(n - 1);
        return n;
    }

}
