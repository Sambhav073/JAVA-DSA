public class max_subarray_sum_9 {
    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printsubarrays(numbers);
    }

    public static void printsubarrays(int numbers[]) {
        int n = numbers.length;
        int subarraycount = 0;
        int min_sum = Integer.MAX_VALUE;
        int max_sum = Integer.MIN_VALUE;
        for (int x = 0; x < n; x++) {
            for (int y = x; y < n; y++) {
                int sum = 0;
                for (int z = x; z <= y; z++) {
                    sum = sum + numbers[z];

                }
                subarraycount++;
                System.out.println("sum of " + subarraycount + "th subarray is " + sum);
                if (max_sum <= sum) {
                    max_sum = sum;
                }
                if (min_sum >= sum) {
                    min_sum = sum;
                }
            }

        }
        System.out.println("max sum of a subarray = " + max_sum);
        System.out.println("min sum of a subarray = " + min_sum);
    }

}