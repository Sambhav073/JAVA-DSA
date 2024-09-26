import java.util.*;

public class use_sortingfunction {
    public static void main(String args[]) {
        // int numbers[] = { 4, 5, 2, 3, 1 };
        Integer numbers[] = { 4, 5, 2, 3, 1 };
        // Arrays.sort(numbers);
        // Arrays.sort(numbers, 0, 4);
        Arrays.sort(numbers,Collections.reverseOrder());
        printarray(numbers);
    }

    public static void printarray(Integer numbers[]) {
        for (int x = 0; x < numbers.length; x++) {
            System.out.print(numbers[x] + " ");
        }
    }
}
