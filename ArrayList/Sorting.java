import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(9);
        list.add(2);
        System.out.println(list);

        // Sorting in ascending order
        Collections.sort(list);
        System.out.println(list);

        // descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
