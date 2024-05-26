
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if (uniques.contains(nums[i])) {
                return true;
            } else {
                uniques.add(nums[i]);
            }
        }
        return false;
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] nums = { 1, 2, 3, 4 };
        // printArray(nums);
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
        return;
    }
}
