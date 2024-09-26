public class check_sorted  {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        System.out.println(sort_search(a, 0));
    }

    public static boolean sort_search(int a[], int i)
     {
        if (i == a.length - 1) {
            return true;

        }
        if (a[i] > a[i + 1]) {
            return false;
        }
        return sort_search(a, i + 1);
    }
}
