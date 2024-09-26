public class swap_two_no {
    public static void main(String args[]) {
        int a = 5, b = 3;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + "," + b);
    }

}
