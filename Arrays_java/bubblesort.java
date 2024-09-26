public class bubblesort {
    public static void main(String args[]) {
        int numbers[] = { 4, 5, 3, 1, 2 };
        bubblesort(numbers);
        printarray(numbers);

    }

    public static void bubblesort(int numbers[]) {
        int n = numbers.length;
        for (int x = 0; x < n - 1; x++) {
            int swap = 0;
            for (int y = 0; y < n - x - 1; y++) {
                if (numbers[y] > numbers[y + 1]) {
                    int temporary = numbers[y];
                    numbers[y] = numbers[y + 1];
                    numbers[y + 1] = temporary;
                    swap++;
                }
            }
            if (swap == 0) {
                break;
            }
        }
    }

    public static void printarray(int numbers[]) {
        for (int x = 0; x < numbers.length; x++) {
            System.out.print(numbers[x] + " ");
        }
    }

}
