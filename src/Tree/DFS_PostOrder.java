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
            if(currentNode.leftChild != null){
                stack.push(currentNode.leftChild);
            }
            if(currentNode.rightChild != null){
                stack.push(currentNode.rightChild);
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
        helperRec(root.leftChild, list);
        helperRec(root.rightChild, list);
        list.add(root.data);
    }

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
//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args) {
//        TreeNode root = createTree();
//        List<Integer> result1 = postOrderRec(root);
//        System.out.println(result1);
//        List<Integer> result2 = postOrderRec(root);
//        System.out.println(result2);
//    }

}
