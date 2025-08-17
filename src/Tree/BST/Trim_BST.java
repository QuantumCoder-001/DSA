package Tree.BST;

public class Trim_BST {
    static TreeNode trimBST(TreeNode root, int low, int high){
        if(root == null){
            return null;
        }
        if(root.data > high){
            return trimBST(root.left, low, high);
        }
        else if(root.data < low){
            return trimBST(root.right, low, high);
        }
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
}

