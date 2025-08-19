package Tree;

public class Path_Sum_III {
    static int count;
    int pathSum(TreeNode root, int targetSum){
        count = 0;
        dfs(root, targetSum);
        return count;
    }
    void dfs(TreeNode root, int targetSum){
        if(root == null){
            return;
        }
        helper(root, targetSum);
        dfs(root.left, targetSum);
        dfs(root.right, targetSum);
    }
    void helper(TreeNode root, int targetSum){
        if(root == null){
            return;
        }
        if(targetSum == 0){
            count++;
        }
        helper(root.left, targetSum-root.data);
        helper(root.right, targetSum-root.data);
    }
}
