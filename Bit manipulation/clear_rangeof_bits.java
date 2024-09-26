public class clear_rangeof_bits {
    public static void main(String args[]) {
        clear_irange(10, 2, 4);

    }

    public static void clear_irange(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = ~(~0 << (i));
        System.out.println(n & (a | b));
    }
}
