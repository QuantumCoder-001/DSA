package Tree;

import java.util.*;

public class DFS_InOrder {
//    static Scanner sc = new Scanner(System.in);
//    static TreeNode createTree(){
//        System.out.println("Enter the data for Node or press -1 for null");
//        int data = sc.nextInt();
//        if(data == -1){
//            return null;
//        }
//        TreeNode node = new TreeNode(data);
//        System.out.println("Enter data for Left Child of "+data);
//        node.leftChild = createTree();
//        System.out.println("Enter data for Right Child of "+data);
//        node.rightChild = createTree();
//        return node;
//    }
    static List<Integer> inOrderRec(TreeNode root){
        List<Integer> list = new ArrayList<>();
        helperRec(root, list);
        return list;
    }
    static void helperRec(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        helperRec(root.leftChild, list);
        list.add(root.data);
        helperRec(root.rightChild, list);
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
                currentNode = currentNode.leftChild;
            }
            currentNode = stack.pop();
            list.add(currentNode.data);
            currentNode = currentNode.rightChild;
        }
        return list;
    }

//    public static void main(String[] args) {
//        TreeNode root = createTree();
//        List<Integer> result1 = inOrderRec(root);
//        System.out.println(result1);
//        List<Integer> result2 = inOrderItr(root);
//        System.out.println(result2);
//
//    }
}
