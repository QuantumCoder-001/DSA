package Tree;
import java.util.*;

public class DFS_PostOrder {

    static List<Integer> postOrderItr(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode currentNode = stack.pop();
            list.addFirst(currentNode.data);
            if(currentNode.left != null){
                stack.push(currentNode.left);
            }
            if(currentNode.right != null){
                stack.push(currentNode.right);
            }
        }
        return list;
    }
    static List<Integer> postOrderRec(TreeNode root){
        List<Integer> list = new ArrayList<>();
        helperRec(root, list);
        return list;
    }
    static void helperRec(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        helperRec(root.left, list);
        helperRec(root.right, list);
        list.add(root.data);
    }
}
