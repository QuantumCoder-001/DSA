package Tree;

public class Diameter_of_Binary_Tree {
    int diameter = 0;
    int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftH = helper(root.left);
        int rightH = helper(root.right);
        diameter = Math.max(diameter, rightH + leftH);
        return Math.max(leftH, rightH) + 1;
    }
    int diameterOfBinaryTree(TreeNode root){
        helper(root);
        return diameter;
    }
}
