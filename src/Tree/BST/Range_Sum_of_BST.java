package Tree.BST;

public class Range_Sum_of_BST {
    int sum;
    void helper(TreeNode root, int low, int high){
        if(root == null){
            return ;
        }
        if(root.data > high){
            helper(root.left, low, high);
        }
        else if(root.data < low){
            helper(root.left, low, high);
        }
        else{
            sum += root.data;
            helper(root.left, low, high);
            helper(root.right, low, high);
        }
    }
    int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        helper(root, low, high);
        return sum;
    }
}
