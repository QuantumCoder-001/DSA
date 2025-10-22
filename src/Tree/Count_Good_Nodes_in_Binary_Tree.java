package Tree;

public class Count_Good_Nodes_in_Binary_Tree {
    int count = 0;
    int maxVal = Integer.MAX_VALUE;
    void helper(TreeNode root){
        if(root == null){
            return;
        }
        int oldMax = maxVal;
        maxVal = Math.max(maxVal, root.data);
        if(root.data == maxVal){
            count++;
        }
        helper(root.left);
        helper(root.right);
        maxVal = oldMax;
    }
    int goodNodes(TreeNode root){
        helper(root);
        return count;
    }
}
