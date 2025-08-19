package Tree;

public class Second_Minimum_Node_In_Binary_Tree {
    long min = Long.MAX_VALUE;
    long sMin = Long.MAX_VALUE;
    void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.data < min) {
            sMin = min;
            min = root.data;
        }
        else if (root.data > min && root.data < sMin) {
            sMin = root.data;
        }
        helper(root.left);
        helper(root.right);
    }
    int findSecondMinimumValue(TreeNode root) {
        helper(root);
        return sMin == Long.MIN_VALUE? -1: (int)sMin;
    }
}
