public class kadanesAlgorithim_12 {
    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        kadanes(numbers);
    }

    public static void kadanes(int numbers[]) {
        int sum = 0;
        int max_number = Integer.MIN_VALUE;
        int max_sum = Integer.MIN_VALUE;
        for (int x = 0; x < numbers.length; x++) {
            sum += numbers[x];
            if (sum < 0) {
                sum = 0;
            }
            if (sum > max_sum) {
                max_sum = sum;
            }
            if (numbers[x] > max_number) {
                max_number = numbers[x];
            }

        }
        if (max_sum == 0) {
            System.out.println(max_number);

        } else {
            System.out.println(max_sum);
        }
    }
}
