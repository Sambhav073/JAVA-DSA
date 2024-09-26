public class check_oddeven {
    public static void oddeven(int n) {
        int bitchecker = 1;
        if ((n & bitchecker) == 1) {
            System.out.println("odd no.");

        } else {
            System.out.println("even no.");
        }
    }

    public static void main(String args[]) {
        oddeven(3);
        oddeven(4);

    }

}
