package Tree;

import java.util.HashMap;
import java.util.Map;

public class Construct_Binary_Tree_from_Preorder_Inorder {
    Map<Integer, Integer> map = new HashMap<>();
    int preOrderIndex = 0;
    TreeNode buildTree(int[] preorder, int[] inorder){
        for(int i = 0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return helper(preorder, 0, preorder.length);
    }
    TreeNode helper(int[] preorder, int start, int end){
        if(start > end){
            return null;
        }
        int nodeValue = preorder[preOrderIndex++];
        TreeNode node = new TreeNode(nodeValue);
        if(start == end){
            return node;
        }
        int index = map.get(nodeValue);
        node.left = helper(preorder, start, index-1);
        node.right = helper(preorder, index+1, end);
        return node;
    }
}
