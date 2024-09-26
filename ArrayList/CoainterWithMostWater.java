import java.util.*;

public class CoainterWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                // if (height.get(i) > height.get(j)) {
                // if (max < (height.get(j)) * (j - i)) {
                // max = (height.get(j)) * (j - i);
                // }
                // } else {
                // if (max < (height.get(i)) * (j - i)) {
                // max = (height.get(i)) * (j - i);
                // }
                // }
                int currheight = Math.min((height.get(j)), (height.get(i)));
                max = Math.max((currheight) * (j - i), max);
            }
        }
        System.out.println(max);
    }
}
