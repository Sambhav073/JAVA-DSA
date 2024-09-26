public class set_ith_bit {
    public static void main(String args[]) {
        set_ith(5, 1);
    }

    public static void set_ith(int n, int position) {
        int place = 1 << position;
        System.out.println(n | place);
    }

}
