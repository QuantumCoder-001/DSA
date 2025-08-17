package Tree;

public class Cousins_in_Binary_Tree {
    static private TreeNode xPArent;
    static private TreeNode yParent;
    static private int xDepth = -1;
    static private int yDepth = -1;
    static void helper(TreeNode node, TreeNode parent, int x, int y, int depth){
        if(node == null){
            return;
        }
        if(node.data == x){
            xDepth = depth;
            xPArent = parent;
        }
        if(node.data == y){
            yDepth = depth;
            yParent = parent;
        }
        helper(node.left, node, x, y, depth + 1);
        helper(node.right, node, x, y, depth + 1);
    }
    boolean isCousins(TreeNode root, int x, int y) {
        helper(root, null,x, y, 0);
        return (xDepth == yDepth && xPArent != yParent);
    }
}
