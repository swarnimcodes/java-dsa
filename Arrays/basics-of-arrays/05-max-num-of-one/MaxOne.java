public class MaxOne {
    public static int maxConsOnes(int[] nums) {
        int count = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                result = Math.max(count, result);
            }
            else {
                count = 0;
            }
        }
        return result;
    }

    // driver method
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,1,1,1,1,1,1,0,1,1,1,0};
        System.out.println(maxConsOnes(arr));
    }
}
