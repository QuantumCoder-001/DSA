package array.Sliding_Window;

public class MaximumAverageSubArray {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(get(nums,k));
    }
    static double get(int[] nums , int k){
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += nums[i];
        }

        double maxAvg = (double) sum/k;
        for(int i = k ;i<nums.length; i++){
            sum = sum - nums[i-k] + nums[i];
            double avg = (double) sum/k;
            maxAvg = Math.max(avg,maxAvg);
        }
        return maxAvg;
    }
}
