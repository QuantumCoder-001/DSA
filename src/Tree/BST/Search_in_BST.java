package Tree.BST;public class Search_in_BST {
    static TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        if(root.data > val){
            return searchBST(root.left, val);
        }
        else if(root.data < val){
            return searchBST(root.right, val);
        }
        else{
            return root;
        }
    }
}
