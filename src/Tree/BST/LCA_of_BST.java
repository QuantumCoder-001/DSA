package Tree.BST;

public class LCA_of_BST {
    TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pVal = p.data;
        int qVal = q.data;
        while (root != null){
            if(root.data > pVal && root.data > qVal){
                root = root.left;
            }
            else if(root.data < pVal && root.data < qVal){
                root = root.right;
            }
            else{
                return root;
            }
        }
        return null;
    }
}
