package array.Counting_Method;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_Array {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                list.add(Math.abs(nums[i]));
            }
            else{
                nums[index] = - nums[index];
            }
        }
        return list;
    }
}
