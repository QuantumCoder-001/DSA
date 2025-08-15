package Tree;

public class Max_Depth_of_BinaryTree {
    static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(rightDepth, leftDepth) + 1;
    }
}
