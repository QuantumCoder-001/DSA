package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_II {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> bigList = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, 0, smallList, bigList);
        return bigList;
    }
    static void  helper(int[] nums, int index, List<Integer> smallList, List<List<Integer>> bigList){

        bigList.add(new ArrayList<>(smallList));

        for(int i = index; i<nums.length; i++){
            if (i > index && nums[i] == nums[i - 1]){
                continue;
            }
            smallList.add(nums[i]);
            helper(nums, i+1, smallList, bigList);
            smallList.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>>  result = subsetsWithDup(nums);
        for(List<Integer> l : result){
            System.out.println(l);
        }
    }
}