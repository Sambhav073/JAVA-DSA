public class updatearray_2 {
    public static void main(String args[]) {
        int marks[] = { 97, 98, 99 };
        update(marks);
        for (int x = 0; x < marks.length; x++) {
            System.out.println(marks[x] + " ");
        }
    }

    public static void update(int marks[]) {
        for (int x = 0; x < marks.length; x++) {
            marks[x] = marks[x] + 1;
        }
    }
}
