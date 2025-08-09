package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> bigList = new ArrayList<>();
        helper(nums, 0, smallList, bigList);
        return bigList;
    }
    static void helper(int[] nums, int index, List<Integer> smallList, List<List<Integer>> bigList){
        bigList.add(new ArrayList<>(smallList));

        for(int i = index; i<nums.length; i++){
            smallList.add(nums[i]);
            helper(nums, i+1, smallList, bigList);
            smallList.remove(smallList.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = subsets(nums);
        System.out.println(result);
    }
}
