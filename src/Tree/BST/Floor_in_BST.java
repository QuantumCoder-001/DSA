package Tree.BST;


class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
    }
}
public class Floor_in_BST {
    static int floor(TreeNode root, int x) {
        return helper(root, x, -1);
    }
    static int helper(TreeNode root, int x, int max){
        if(root == null){
            return max;
        }
        if(root.data > x){
            return helper(root.left, x, max);
        }
        else if(root.data < x){
            max = root.data;
            return helper(root.right, x, max);
        }
        else{
            return root.data;
        }
    }
}
