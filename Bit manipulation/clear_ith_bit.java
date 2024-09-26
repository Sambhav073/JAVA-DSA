public class clear_ith_bit {

    public static void main(String args[]) {
        clear_ith(6, 1);
    }

    public static void clear_ith(int n, int position) {
        int place = ~(1 << position);
        System.out.println(n & place);
    }

}
