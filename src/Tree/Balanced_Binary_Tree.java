package Tree;

public class Balanced_Binary_Tree {
    int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftH = helper(root.left);
        if(leftH == -1){
            return -1;
        }
        int rightH = helper(root.right);
        if(rightH == -1){
            return -1;
        }
        if(Math.abs(leftH - rightH) > 1){
            return -1;
        }
        return Math.max(leftH, rightH) + 1;
    }
    boolean isBalanced(TreeNode root){
        return helper(root) != -1;
    }
}
