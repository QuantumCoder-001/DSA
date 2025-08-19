package Tree;

import java.util.ArrayList;
import java.util.List;

public class Path_Sum_II {
    void helper(TreeNode root, List<Integer> smallList, List<List<Integer>> bigList, int targetSum){
        if(root == null){
            return;
        }
        smallList.add(root.data);
        if(targetSum == 0 && root.left == null && root.right == null){
            bigList.add(new ArrayList<>(smallList));
            smallList.removeLast();
            return;
        }
        helper(root.left, smallList, bigList, targetSum-root.data);
        helper(root.right, smallList, bigList, targetSum-root.data);
        smallList.removeLast();
    }
    List<List<Integer>> pathSum(TreeNode root, int targetSum){
        List<List<Integer>> bigList = new ArrayList<>();
        List<Integer> smallList = new ArrayList<>();
        helper(root, smallList, bigList, targetSum);
        return bigList;
    }
}
