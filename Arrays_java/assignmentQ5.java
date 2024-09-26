public class assignmentQ5 {
    public static void main(String args[]) {
        int nums[] = { -1, 0, 1, 2, -1, 4 };
        triplets(nums);

    }

    public static void triplets(int nums[]) {
        int n = nums.length;
        for (int x = 0; x < n; x++) {
            for (int y = x; y < n; y++) {
                for (int z = y; z < n; z++) {
                    if (x != y && y != z && z != x) {

                        if (nums[x] + nums[y] + nums[z] == 0) {
                            System.out.println(nums[x] + "," + nums[y] + "," + nums[z]);
                        }
                    }
                }
            }
        }
    }

}
