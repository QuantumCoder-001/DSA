package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> bigList = new ArrayList<>();
        helper(candidates, target, 0, smallList, bigList);
        return bigList;
    }

    static void helper(int[] nums, int target, int index, List<Integer> smallList, List<List<Integer>> bigList) {
        if(target == 0){
            bigList.add(new ArrayList<>(smallList));
        }
        for(int i = index; i<nums.length; i++){
            if(nums[i] > target){
                break;
            }
            if(i > index && nums[i] == nums[i-1]){
                continue;
            }
            smallList.add(nums[i]);
            helper(nums, target-nums[i], i+1, smallList, bigList);
            smallList.remove(smallList.size()-1);
        }
    }


    public static void main(String[] args) {
        int[] nums = {2,5,2,1,2};
        int target = 5;
        List<List<Integer>> result = combinationSum2(nums, target);
        System.out.println(result);
    }
}
