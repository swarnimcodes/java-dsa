import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            int requiredNum = target - nums[i];
            int reqIndex = Arrays.binarySearch(nums, requiredNum);
            if (reqIndex < 0) {
                continue;
            }
            if (reqIndex == i) {
                continue;
            } else {
                ans[0] = i;
                ans[1] = reqIndex;
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}