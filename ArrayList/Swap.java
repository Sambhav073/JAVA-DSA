import java.util.*;

public class Swap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println(list);
        int temp = list.get(3);
        list.set(3, list.get(1));
        list.set(1, temp);
        System.out.println(list);
    }
}
