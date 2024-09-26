import java.util.*;

public class Monotonic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(checkmono(list));
    }

    public static boolean checkmono(ArrayList<Integer> list) {
        boolean checkasc = true, checkdesc = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) <= list.get(i + 1)) {
                continue;
            } else {
                checkasc = false;
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                continue;
            } else {
                checkdesc = false;
            }
        }
        return (checkasc || checkdesc);
    }
}
