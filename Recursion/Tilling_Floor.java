public class Tilling_Floor {
    public static void main(String args[]) {
        System.out.println(NoWaysTiled(5));
    }

    // Length is considered as 2 units of floor as well as 2units for tiles with
    // width 1unit.
    public static int NoWaysTiled(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int VertivalWays = NoWaysTiled(n - 1);
        int HorizantalWays = NoWaysTiled(n - 2);
        int Total = VertivalWays + HorizantalWays;
        return Total;
    }

}
