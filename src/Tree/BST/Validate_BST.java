package Tree.BST;

public class Validate_BST {
    static boolean helper(TreeNode root, long min, long max){
        if(root == null){
            return true;
        }
        if(root.data >= max || root.data <= min){
            return false;
        }
        boolean left = helper(root.left, min, root.data);
        boolean right = helper(root.right, root.data, max);
        return left && right;
    }
    static boolean isValidaBST(TreeNode root){
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
