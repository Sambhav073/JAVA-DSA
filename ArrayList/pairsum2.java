
//array is sorted but rotated
import java.util.*;

public class pairsum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 18;
        System.out.println(pairsum(list, target));
    }

    public static boolean pairsum(ArrayList<Integer> list, int target) {
        int bp = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;// breaking point
                break;
            }
        }
        int lp = bp + 1;// smallest
        int rp = bp;// largest
        int n = list.size();
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (rp + n - 1) % n;
            }
        }
        return false;
    }
}
