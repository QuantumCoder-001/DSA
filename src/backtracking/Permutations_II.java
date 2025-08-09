package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations_II {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> bigList = new ArrayList<>();
        boolean[] isVisited = new boolean[nums.length];
        helper(nums, smallList, bigList, isVisited);
        return bigList;
    }
    static void helper(int[] nums, List<Integer> smallList, List<List<Integer>> bigList, boolean[] isVisited){
        if(nums.length == smallList.size()){
            bigList.add(new ArrayList<>(smallList));
            return;
        }
        for(int i = 0; i<nums.length; i++){
            if(isVisited[i]){
                continue;
            }
            if(i > 0 && nums[i] == nums[i-1] && isVisited[i-1]) {
                continue;
            }
            smallList.add(nums[i]);
            isVisited[i] = true;
            helper(nums, smallList, bigList, isVisited);
            smallList.remove(smallList.size()-1);
            isVisited[i] = false;
        }

    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        List<List<Integer>> result = permuteUnique(nums);
        System.out.println(result);
    }
}
