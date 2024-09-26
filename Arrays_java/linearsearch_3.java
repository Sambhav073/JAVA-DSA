public class linearsearch_3 {
    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;
        System.out.println(linearsearch(numbers, key));

    }

    public static int linearsearch(int numbers[], int key) {
        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] == key) {

                return x;
            }

        }
        return -1;
    }

}
