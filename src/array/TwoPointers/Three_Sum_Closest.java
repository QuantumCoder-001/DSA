package array.TwoPointers;

import java.util.Arrays;

public class Three_Sum_Closest {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int min = 0;
        Arrays.sort(nums);
        int closet = nums[1] + nums[2] + nums[0];
        for(int i = 0; i < n-2; i++){
            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(closet - target) > Math.abs(sum - target)){
                    closet = sum;
                }
                if(sum > target){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return closet;
    }
}
