package array.Binary_Search;

import java.util.Arrays;

public class Min_Increment_to_Make_Array_Unique {
    public int minIncement(int[] nums){
        Arrays.sort(nums);
        int moves = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i-1] >= nums[i]){
                int inc = nums[i-1] - nums[i] + 1;
                moves += inc;
                nums[i] = nums[i-1] + 1;
            }
        }
        return moves;
    }
}
