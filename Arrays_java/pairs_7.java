public class pairs_7 {
    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        paired(numbers);

    }

    public static void paired(int numbers[]) {
        for (int x = 0; x < numbers.length; x++) {
            for (int y = x + 1; y < numbers.length; y++) {
                System.out.print(numbers[x] + "," + numbers[y] + " ");
            }
            System.out.println();
        }
    }

}
