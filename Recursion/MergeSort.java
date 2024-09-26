public class MergeSort {
    public static void main(String args[]) {
        int array[] = { 2, 4, 3, 5, 6, 7 };
        SortArray(array, 0, array.length - 1);
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + "  ");
        }
    }

    public static void SortArray(int array[], int start, int end) {
        if (start == end || start > end) {
            return;
        }
        int mid = (end + start) / 2;
        SortArray(array, start, mid);
        SortArray(array, mid + 1, end);
        merge(array, start, mid, end);

    }

    public static void merge(int array[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start;// iterator for left part
        int j = mid + 1;// iterator for right part
        int k = 0;// iterator for temporary array
        while (i <= mid && j <= end) {
            if (array[i] < array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }
        // left part
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= end) {
            temp[k++] = array[j++];
        }
        for (k = 0, i = start; k < temp.length; k++, i++) {
            array[i] = temp[k];
        }
    }

}
