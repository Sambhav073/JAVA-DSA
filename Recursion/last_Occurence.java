public class last_Occurence {
    public static void main(String args[]) {
        int a[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 5;
        System.out.println(lastOccurence(a, key, 0)); // a.length - 1));
    }

    public static int lastOccurence(int a[], int key, int i) {
        // if (key == a[i]) {
        // return i;
        // }
        // if (i == 0) {
        // return -1;
        // }
        // int r = lastOccurence(a, key, i - 1);
        // return r;
        if (i == a.length) {
            return -1;
        }
        int isfound = lastOccurence(a, key, i + 1);
        if (isfound == -1 && key == a[i]) {
            return i;
        }
        return isfound;

    }
}