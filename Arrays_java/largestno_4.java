import java.util.*;

public class largestno_4 {
    public static void main(String args[]) {
        int numbers[] = { 1, 2, 6, 3, 5 };
        System.out.println(largest(numbers));
    }

    public static int largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] > largest) {
                largest = numbers[x];
            }
        }
        return largest;
    }

}
