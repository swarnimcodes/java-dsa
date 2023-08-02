public class TwoSum {
    public static int[] twosum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {22, 24, 2, 7, 11, 15};
        int target = 9;
        int[] ans = {0,1};
        ans = twosum(nums, target);
        for (int i = 0; i < ans.length; i++) {
        System.out.println(ans[i]);
        }
    }
}