import java.util.*;

public class LonelyNumbersOptimized {
    public ArrayList<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] == nums[i] || nums[i] == nums[i + 1] || nums[i] == nums[i - 1] + 1
                    || nums[i] == nums[i + 1] - 1) {
                continue;
            } else {
                ans.add(nums[i]);
            }
        }
        if (nums.length > 1) {
            if (nums[0] != nums[1] && nums[0] + 1 < nums[1]) {
                ans.add(nums[0]);
            }
            if (nums[nums.length - 1] != nums[nums.length - 2]
                    && nums[nums.length - 1] > nums[nums.length - 2] + 1) {
                ans.add(nums[nums.length - 1]);
            }
        } else {
            ans.add(nums[0]);
        }
        return ans;

    }
}
