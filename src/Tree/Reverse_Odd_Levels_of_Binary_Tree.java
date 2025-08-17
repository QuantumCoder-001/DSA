package Tree;

public class Reverse_Odd_Levels_of_Binary_Tree {
    static void helper(TreeNode left, TreeNode right, int level){
        if(left == null || right == null){
            return;
        }
        if(level % 2 == 0){
            int temp = left.data;
            left.data = right.data;
            right.data = temp;
        }
        helper(left.left, right.right, level + 1);
        helper(left.right, right.left, level + 1);
    }
    static TreeNode reverseOddLevels(TreeNode root){
        if(root == null){
            return null;
        }
        helper(root.left, root.right, 0);
        return root;
    }
}
