package Tree;

import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
    }
}

public class TreeBasic {
    static Scanner sc = new Scanner(System.in);
    static void printTree(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }
    static TreeNode createTree(){
        System.out.println("Enter the Data for Node or Press -1 for Null:");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        TreeNode node = new TreeNode(data);
        System.out.println("Enter the Left Child of "+data);
        node.left = createTree();
        System.out.println("Enter the Right Child of "+data);
        node.right = createTree();
        return node;

    }
    public static void main(String[] args) {
        TreeNode node = createTree();
        printTree(node);
    }
}
