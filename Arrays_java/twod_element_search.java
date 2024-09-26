public class twod_element_search {
    public static void main(String args[]) {
        int numbers[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key = 33;
        System.out.println(search(numbers, key));
    }

    public static boolean search(int numbers[][], int key) {
        int row = 0;
        int col = numbers[0].length - 1;
        while (row < numbers.length && col >= 0) {
            if (numbers[row][col] == key) {
                return true;
            } else if (numbers[row][col] > key) {
                col--;
            } else {
                row++;
            }

        }
        return false;
    }

}
