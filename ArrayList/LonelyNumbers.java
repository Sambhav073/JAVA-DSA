import java.util.*;

public class LonelyNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        for (int i = 0; i < list.size(); i++) {
            if (check(list, i)) {
                ans.add(list.get(i));
            }
        }
        System.out.println(ans);
    }

    public static boolean check(ArrayList<Integer> list, int i) {
        for (int j = 0; j < list.size(); j++) {
            if (i != j && (list.get(j) == list.get(i) || list.get(j) == list.get(i) + 1
                    || list.get(j) == list.get(i) - 1)) {
                return false;
            }
        }
        return true;
    }
}
