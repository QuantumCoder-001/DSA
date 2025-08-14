package Tree;

import java.util.*;

public class BFS_LevelOrder_I {

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

    static List<List<Integer>> levelOrderItr(TreeNode root){
        List<List<Integer>> bigList = new ArrayList<>();
        if(root == null){
            return bigList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> smallList = new ArrayList<>();
            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = queue.poll();
                smallList.add(currentNode.data);
                if(currentNode.leftChild != null){
                    queue.add(currentNode.leftChild);
                }
                if(currentNode.rightChild != null){
                    queue.add(currentNode.rightChild);
                }
            }
            bigList.add(smallList);
        }
        return bigList;
    }

//    public static void main(String[] args) {
//        TreeNode root = createTree();
//        List<List<Integer>> result = levelOrderItr(root);
//        System.out.println(result);
//    }
}
