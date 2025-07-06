package array.Sliding_Window;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(get(nums,k));
    }
    static int get(int[] arr, int k){
        int maxsum = 0;
        for(int i = 0; i<k; i++){
            maxsum += arr[i];
        }
        int sum = maxsum;
        for(int i = k; i<arr.length; i++){
            sum = sum - arr[i-k] + arr[i];
            maxsum = Math.max(maxsum,sum);
        }
        return maxsum;
    }
}
