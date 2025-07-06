package array.PreComputation;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {6,5,1,3,3,5};
        System.out.println(getSum(nums));
    }
    static int getSum(int [] nums){
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        int leftSum = 0;
        for(int i = 0; i< nums.length; i++){
            int rightSum = sum - leftSum - nums[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
