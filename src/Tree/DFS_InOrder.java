package Tree;

import java.util.*;

public class DFS_InOrder {
    static List<Integer> inOrderRec(TreeNode root){
        List<Integer> list = new ArrayList<>();
        helperRec(root, list);
        return list;
    }
    static void helperRec(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        helperRec(root.left, list);
        list.add(root.data);
        helperRec(root.right, list);
    }

    static List<Integer> inOrderItr(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode currentNode = root;
        while(!stack.isEmpty() || currentNode != null){
            while(currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            list.add(currentNode.data);
            currentNode = currentNode.right;
        }
        return list;
    }
}
