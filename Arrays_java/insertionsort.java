public class insertionsort {
    public static void main(String args[]) {
        int numbers[] = { 4, 5, 2, 3, 1 };
        insertionsort(numbers);
        printarray(numbers);
    }

    public static void insertionsort(int numbers[]) {
        int n = numbers.length;
        for (int x = 1; x < n; x++) {
            int current = numbers[x];
            int prev = x - 1;
            while (prev >= 0 && numbers[prev] > current) {
                numbers[prev + 1] = numbers[prev];
                prev--;
            }
            numbers[prev + 1] = current;
        }
    }

    public static void printarray(int numbers[]) {
        for (int x = 0; x < numbers.length; x++) {
            System.out.print(numbers[x] + " ");
        }
    }
}
