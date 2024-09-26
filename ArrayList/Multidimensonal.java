import java.util.*;

public class Multidimensonal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        list.add(array);
        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(3);
        array2.add(4);
        list.add(array2);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            ArrayList<Integer> currlist = list.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }
    }
}