package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_LevelOrder {
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
    static void levelOrder(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            System.out.println(currentNode.data);
            if(currentNode.leftChild != null){
                queue.add(currentNode.leftChild);
            }
            if(currentNode.rightChild != null){
                queue.add(currentNode.rightChild);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = createTree();
        levelOrder(root);
    }
}
