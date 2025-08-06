package array.Sliding_Window;

public class Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                min = Math.min(right - left + 1, min);
                sum -= nums[left];
                left++;
            }
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }
}
