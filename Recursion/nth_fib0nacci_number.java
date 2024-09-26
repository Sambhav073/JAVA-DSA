public class nth_fib0nacci_number {
    public static void main(String args[]) {
        System.out.println(fibo(100));
    }

    public static long fibo(long n) {
        if (n == 0 || n == 1) {
            return n;
        }
        n = fibo(n - 1) + fibo(n - 2);
        return n;
    }

}
