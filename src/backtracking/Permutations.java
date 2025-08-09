package backtracking;
import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> bigList = new ArrayList<>();
        helper(nums, smallList, bigList);
        return bigList;
    }
    static void helper(int[] nums, List<Integer> smallList, List<List<Integer>> bigList){
        if(nums.length == smallList.size()){
            bigList.add(new ArrayList<>(smallList));
            return;
        }
        for (int num : nums) {
            if (!smallList.contains(num)) {
                smallList.add(num);
                helper(nums, smallList, bigList);
                smallList.remove(smallList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }
}
