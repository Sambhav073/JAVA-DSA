public class first_occuerence {
    public static void main(String args[]) {
        int a[] = { 8, 2, 6, 9, 5, 10, 2, 5, 3 };
        int key = 7;
        System.out.println(firstOccurence(a, key, 0));
    }

    public static int firstOccurence(int a[], int key, int i) {

        // if (i == a.length) {
        // return -1;
        // }
        if (key == a[i]) {
            return i;
        }
        if (i == a.length - 1) {
            return -1;
        }

        int r = firstOccurence(a, key, i + 1);

        return r;

    }

}
