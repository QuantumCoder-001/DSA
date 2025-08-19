package Tree;

public class Path_Sum_I {
    boolean hasPathSum(TreeNode root, int targetSum){
        if(root == null){
            return false;
        }
        if(root.right == null && root.left == null){
            return targetSum == root.data;
        }
        boolean left = hasPathSum(root.left, targetSum-root.data);
        boolean right = hasPathSum(root.right,  targetSum-root.data);
        return  right || left;
    }
}
