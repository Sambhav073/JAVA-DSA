public class trappingrainwater_13 {
    public static void main(String args[]) {
        int height[] = { 2,5,1,0,2,1,3,1,2 };
        trappedwater(height);
    }

    public static void trappedwater(int height[]) {
        int n = height.length;
        int left_max_boundary[] = new int[n];
        left_max_boundary[0] = height[0];
        for (int x = 1; x < n; x++) {
            left_max_boundary[x] = Math.max(height[x], left_max_boundary[x - 1]);
        }
        int right_max_boundary[] = new int[n];
        right_max_boundary[n - 1] = height[n - 1];
        for (int x = n - 2; x >= 0; x--) {
            right_max_boundary[x] = Math.max(height[x], right_max_boundary[x + 1]);
        }
        int trapped_rainwater = 0;
        for (int x = 0; x < n; x++) {
            int waterlevel = Math.min(left_max_boundary[x], right_max_boundary[x]);
            trapped_rainwater += waterlevel - height[x];
        }
        System.out.println(trapped_rainwater);
    }
}
