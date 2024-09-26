public class update_ith_bit {
    public static void main(String args[]) {
        UpdateIth_bit(5, 1, 1);

    }

    public static void UpdateIth_bit(int n, int i, int newbit) {
        if (newbit == 0) {
            clear_ith(n, i);
        } else {
            set_ith(n, i);
        }
    }

    public static void set_ith(int n, int position) {
        int place = 1 << position;
        System.out.println(n | place);
    }

    public static void clear_ith(int n, int position) {
        int place = ~(1 << position);
        System.out.println(n & place);
    }

}
