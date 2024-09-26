import java.util.*;

public class PairSum {
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
        for (int x = 0; x < list.size(); x++) {
            for (int y = x + 1; y < list.size(); y++) {
                if (list.get(x) + list.get(y) == key) {
                    System.out.println(list.get(x) + "," + list.get(y));
                }
            }
        }
    }
}
