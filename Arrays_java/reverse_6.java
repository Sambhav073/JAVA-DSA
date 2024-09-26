/*public class reverse_6 {
    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        int reversearray[] = new int[numbers.length];
        for (int x = numbers.length - 1; x >= 0; x--) {
            reversearray[numbers.length - 1 - x] = numbers[x];
        }
        for (int x = 0; x < reversearray.length; x++) {
            System.out.print(reversearray[x] + " ");
        }

    }
}*/
public class reverse_6 {
    public static void reverse(int numbers[]) {

        int first = 0, last = numbers.length - 1;
        while (first < last) {
            int a = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = a;
            first++;
            last--;
        }

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        reverse(numbers);
        for (int x = 0; x < numbers.length; x++) {
            System.out.print(numbers[x] + " ");
        }
    }
}
