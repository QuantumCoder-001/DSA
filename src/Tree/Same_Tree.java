package Tree;

public class Same_Tree {
    static boolean isSameTree(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null){
            return true;
        }
        if(t1 == null || t2 == null){
            return false;
        }
        return (t1.data == t2.data) && isSameTree(t1.left, t2. left) && isSameTree(t1.right, t2.right);
    }
}
