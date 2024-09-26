public class clear_last_i_bits {
    public static void main(String args[]) {
        clear_ibits(15, 2);

    }

    public static void clear_ibits(int n, int i) {
        System.out.println(n & (~0 << i));
    }

}
