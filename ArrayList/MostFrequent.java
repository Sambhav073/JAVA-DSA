import java.util.*;

public class MostFrequent {
    public static int mostFrequent(int[] nums, int key) {
        int target;
        int ans = key;
        int c2 = 0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                list.add(nums[i + 1]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int c = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    c++;
                }
            }
            if (c >= max) {
                ans = list.get(i);
                max = c;
            }
        }

        return ans;
    }

    public int mostFrequent2(int[] nums, int key) {
        int[] result = new int[1000];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                result[nums[i + 1] - 1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < 1000; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = { 2, 1000, 2, 1000, 3 };
        int key = 2;
        System.out.println(mostFrequent(a, key));
    }

}
