public class selectionsort {
    public static void main(String args[]) {
        int numbers[] = { 4, 5, 3, 1, 2 };
        selectionsort(numbers);
        printarray(numbers);

    }

    public static void selectionsort(int numbers[]) {
        int n = numbers.length;
        for (int x = 0; x < n - 1; x++) {
            int minpos = x;
            for (int y = x + 1; y <= n - 1; y++) {
                if (numbers[y] < numbers[minpos]) {
                    minpos = y;
                }

            }

            int temporary = numbers[minpos];
            numbers[minpos] = numbers[x];
            numbers[x] = temporary;

        }
    }

    public static void printarray(int numbers[]) {
        for (int x = 0; x < numbers.length; x++) {
            System.out.print(numbers[x] + " ");
        }
    }

}
