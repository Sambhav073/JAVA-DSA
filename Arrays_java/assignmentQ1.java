
import java.util.*;

public class assignmentQ1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements you want to check:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("please enter the values: ");
        for (int x = 0; x < n; x++) {
            nums[x] = sc.nextInt();
        }
        System.out.println(repeatedelements(nums, n));
    }

    public static boolean repeatedelements(int nums[], int n) {
        for (int x = 0; x < n; x++) {
            for (int y = x + 1; y < n; y++) {
                if (nums[x] == nums[y]) {
                    return true;
                }
            }
        }
        return false;
    }

}
