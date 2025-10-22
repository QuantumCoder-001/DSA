package Tree;

import java.util.ArrayList;
import java.util.List;

public class All_Nodes_Distance_K_in_Binary_Tree {
    List<Integer> result = new ArrayList<>();
    void collect(TreeNode root, int level){
        if(root == null || level < 0){
            return;
        }
        if(level == 0){
            result.add(root.data);
            return;
        }
        collect(root.left, level - 1);
        collect(root.right, level - 1);
    }
    int helper(TreeNode root, TreeNode target, int k){
        if(root == null){
            return -1;
        }
        if(target == root){
            collect(root, k);
            return 0;
        }
        int left = helper(root.left, target, k);
        if(left != -1){
            if(left + 1 == k){
                result.add(root.data);
            }
            else{
                collect(root.right, k-left-2);
            }
            return left+1;
        }
        int right = helper(root.right, target, k);
        if(right != -1){
            if(right + 1 == k){
                result.add(root.data);
            }
            else{
                collect(root.left, k-right-2);
            }
            return right+1;
        }
        return -1;
    }
    List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        helper(root, target, k);
        return result;
    }
}
