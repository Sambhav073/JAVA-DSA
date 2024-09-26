public class friendsPairing {
    public static void main(String args[]) {
        System.out.println(TotalWays(5));
    }

    public static int TotalWays(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int Singleperson = TotalWays(n - 1);
        int Paired = TotalWays(n - 2);
        int Total = Singleperson + Paired * (n - 1);
        return Total;
    }

}
