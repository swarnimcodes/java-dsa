import java.util.HashMap;
import java.util.Map;

public class TwoSumTwoPassHashTable {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }


        return new int[]{}; // no solution found
    }

    public static void main(String[] args) {
        int[] nums = {22, 24, 2, 7, 11, 15};
        int target = 9;
        int[] ans = {0,1};
        ans = twoSum(nums, target);
        for (int i = 0; i < ans.length; i++) {
        System.out.println(ans[i]);
        }
    }
}
