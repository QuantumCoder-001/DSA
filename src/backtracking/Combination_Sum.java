package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> bigList = new ArrayList<>();
        helper(candidates, 0, target, smallList, bigList);
        return bigList;
    }
    static void helper(int[] nums, int index, int target, List<Integer> smallList, List<List<Integer>> bigList){
        if(target == 0){
            bigList.add(new ArrayList<>(smallList));
            return;
        }
        for(int i = index; i<nums.length; i++){
            if(nums[i] > target){
                break;
            }
            smallList.add(nums[i]);
            helper(nums, i,target-nums[i], smallList, bigList);
            smallList.remove(smallList.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        int target = 7;
        List<List<Integer>> result = combinationSum(nums, target);
        System.out.println(result);
    }
}
