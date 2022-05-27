public class SquareSort {
    public static int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int x, y;

        int[] ans = new int[nums.length];
        int r = nums.length - 1;

        while (i <= j) {
            x = nums[i] * nums [i];
            y = nums[j] * nums[j];
            
            if (x > y) {
                ans[r] = x;
                i++;
                r--;
            }

            else {
                ans[r] = y;
                j--;
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11};
        arr = sortedSquares(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
