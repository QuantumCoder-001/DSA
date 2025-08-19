package Tree;

public class Sum_of_Leaf_Nodes {
    int sumOfLeaves(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return root.data;
        }
        int left = sumOfLeaves(root.left);
        int right = sumOfLeaves(root.right);
        return left + right;
    }
}
