import java.util.*;

public class pairSum_optimized {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        pairExist(list, key);
    }

    public static void pairExist(ArrayList<Integer> list, int key) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp != rp) {
            if ((list.get(lp) + list.get(rp)) == key) {
                System.out.println(lp + "," + rp);
            }
            if ((list.get(lp) + list.get(rp)) < key) {
                lp++;
            } else {
                rp--;
            }
        }
    }
}
