public class get_ith_bit {
    public static void main(String args[]) {
        get_ith(5, 0);
    }

    public static void get_ith(int n, int position) {
        int place = 1 << position;
        if ((n & place) == 0) {
            System.out.print("0");
        } else {
            System.out.println("1");
        }

    }

}
