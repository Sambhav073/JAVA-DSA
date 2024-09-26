public class prefixmax_subarray_sum_10 {
    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        printsubarrays(numbers);
    }

    public static void printsubarrays(int numbers[]) {
        int n = numbers.length;

        int min_sum = Integer.MAX_VALUE;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[n];
        for (int x = 0; x < n; x++) {

            prefix[x] = (x == 0 ? 0 : prefix[x - 1]) + numbers[x];

        }

        for (int x = 0; x < n; x++) {
            int sum = 0;
            for (int y = n - 1; y >= x; y--) {
                sum = prefix[y] - ((x == 0) ? 0 : (prefix[x - 1]));
                if (max_sum <= sum) {
                    max_sum = sum;
                }
                if (min_sum >= sum) {
                    min_sum = sum;
                }

            }

        }

        /*
         * if (max_sum <= sum) {
         * max_sum = sum;
         * }
         * if (min_sum >= sum) {
         * min_sum = sum;
         * }
         */

        System.out.println("max sum of a subarray = " + max_sum);
        System.out.println("min sum of a subarray = " + min_sum);
    }

}