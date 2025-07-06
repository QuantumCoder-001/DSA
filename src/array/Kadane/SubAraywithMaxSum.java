package array.Kadane;

public class SubAraywithMaxSum {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(getMaxSum(nums));
    }

    static int getMaxSum(int[] nums) {
        int sum = nums[0];
        int max = sum;
        for(int i = 1; i<nums.length; i++){
            sum += nums[i];
            sum  = Math.max(sum, nums[i]);
            max = Math.max(sum,max);
        }
        return max;
    }
}
