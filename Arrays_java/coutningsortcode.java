public class coutningsortcode {
    public static void main(String args[]) {
        int numbers[] = { 2, 4, 5, 3, 1 };
        countsort(numbers);
        printarray(numbers);
    }

    public static void countsort(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int x = 0; x < numbers.length; x++) {
            largest = Math.max(largest, numbers[x]);
        }
        int count[] = new int[largest + 1];
        for (int x = 0; x < numbers.length; x++) {
            count[numbers[x]]++;
        }
        int y = 0;
        for (int x = 0; x < count.length; x++) {
            while (count[x] > 0) {
                numbers[y] = x;
                y++;
                count[x]--;
            }
        }
    }

    public static void printarray(int numbers[]) {
        for (int x = 0; x < numbers.length; x++) {
            System.out.print(numbers[x] + " ");
        }
    }

}
