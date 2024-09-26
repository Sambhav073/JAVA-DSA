public class increasing_numbers {
    // public static void main(String args[]) {
    // Inc_numbers(10, 1);
    // }

    // public static void Inc_numbers(int n, int a) {
    // if (a == n) {
    // System.out.println(n);
    // return;
    // }
    // System.out.print(a + " ");
    // Inc_numbers(n, a + 1);
    // }
    public static void main(String args[]) {
        printInc(10);

    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        printInc(n - 1);
        System.out.print(n + " ");
    }

}
