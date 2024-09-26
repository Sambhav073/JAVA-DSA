public class keyOccurence {
    public static void main(String[] args) {
        int array[] = { 2, 2, 3, 4, 2, 45, 2, 2 };
        PositionKey(0, array, 2, 0);
    }

    public static void PositionKey(int p, int array[], int key, int c) {
        if (p == array.length) {
            if (c == 0) {
                System.out.println("Key not found");
            }
            return;
        }

        if (array[p] == key) {
            System.out.print(p + " ");
            c++;
        }
        PositionKey(p + 1, array, key, c);

    }

}
