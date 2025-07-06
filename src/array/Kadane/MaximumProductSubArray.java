package array.Kadane;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int [] nums = {2,3,-2,4,3};
        System.out.println(getProduct(nums));

    }
    static int getProduct(int[] nums){
        int currentmax = nums[0];
        int max = nums[0];
        int currentmin = nums[0];
        for(int i = 1; i<nums.length; i++){
            int tempmax = currentmax;
            int current = nums[i];
            currentmax = Math.max(current,Math.max(current*currentmax,current*currentmin));
            currentmin = Math.min(current, Math.min(tempmax*current,current*currentmin));
            max = Math.max(currentmax,max);
        }
        return max;
    }
}
