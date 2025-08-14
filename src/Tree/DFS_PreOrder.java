package Tree;

import java.util.*;

public class DFS_PreOrder {
    static Scanner sc = new Scanner(System.in);
    static TreeNode createTree(){
        System.out.println("Enter the data for Node or press -1 for null");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        TreeNode node = new TreeNode(data);
        System.out.println("Enter data for Left Child of "+data);
        node.leftChild = createTree();
        System.out.println("Enter data for Right Child of "+data);
        node.rightChild = createTree();
        return node;
    }
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
        helperRec(root.leftChild, list);
        helperRec(root.rightChild, list);
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
            if(currentNode.rightChild != null){
                stack.push(currentNode.rightChild);
            }
            if(currentNode.leftChild != null){
                stack.push(currentNode.leftChild);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = createTree();
        List<Integer> result1 = preOrderRec(root);
        List<Integer> result2 = preOrderItr(root);
        System.out.println(result1);
        System.out.println(result2);
    }
}
