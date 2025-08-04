package array.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n-2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = n-1;
            while (left < right) {

                if(nums[left] + nums[right] + nums[i] == 0 ){
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;

                } else if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                }
                else{
                    left++;
                }
            }
        }

        System.out.println(list);;
        
    }
}
