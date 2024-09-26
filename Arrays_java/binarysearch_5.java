public class binarysearch_5 {
    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 2;
        System.out.println(binarysearch(numbers, key));

    }

    public static int binarysearch(int numbers[], int key) {
        int n = numbers.length;

        int first = 0;
        int last = n - 1;

        while (first <= last) {
            int mid = (last + first) / 2;
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] > key) {
                last = mid - 1;
                mid = (last + first) / 2;
            } else {

                first = mid + 1;
                mid = (last + first) / 2;
            }
        }

        return -1;
    }

}