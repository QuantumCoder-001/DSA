package Tree;

import java.util.*;

public class DFS_PreOrder {
    static List<Integer> preOrderRec(TreeNode root){
        List<Integer> list = new ArrayList<>();
        helperRec(root, list);
        return list;
    }
    static void helperRec(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.data);
        helperRec(root.left, list);
        helperRec(root.right, list);
    }

    static List<Integer> preOrderItr(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode currentNode = stack.pop();
            list.add(currentNode.data);
            if(currentNode.right != null){
                stack.push(currentNode.right);
            }
            if(currentNode.left != null){
                stack.push(currentNode.left);
            }
        }
        return list;
    }
}
