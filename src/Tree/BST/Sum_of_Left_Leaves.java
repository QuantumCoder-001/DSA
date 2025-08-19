package Tree.BST;

public class Sum_of_Left_Leaves {

    int sumOfLeftLeaves(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left != null && root.left.left == null && root.left.right == null){
            return root.left.data + sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
