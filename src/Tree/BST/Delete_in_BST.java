package Tree.BST;

public class Delete_in_BST {
    TreeNode deleteNode(TreeNode root, int key){
        if(root == null){
            return null;
        }
        if(root.data > key){
            root.left = deleteNode(root.left, key);
        }
        else if(root.data < key){
            root.right = deleteNode(root.right, key);
        }
        else{
            if(root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            int min = findMin(root.left);
            root.data = min;
            root.right = deleteNode(root.right, min);
        }
        return root;
    }
    int findMin(TreeNode root){
        while ((root.left != null)){
            root = root.left;
        }
        return root.data;
    }
}
