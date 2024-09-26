public class subarrays_8 {
    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printsubarrays(numbers);
    }

    public static void printsubarrays(int numbers[]) {
        int n = numbers.length;
        int totalpairs = 0;
        for (int x = 0; x < n; x++) {
            for (int y = x; y < n; y++) {
                for (int z = x; z <= y; z++) {
                    System.out.print(numbers[z] + " ");

                }
                totalpairs++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total np. of subarrays = " + totalpairs);
    }

}
