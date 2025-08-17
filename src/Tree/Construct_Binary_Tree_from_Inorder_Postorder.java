package Tree;

import java.util.HashMap;
import java.util.Map;

public class Construct_Binary_Tree_from_Inorder_Postorder {
    int postOrderIndex;
    Map<Integer, Integer> map = new HashMap<>();
    TreeNode buildTree(int[] inorder, int[] postorder){
        postOrderIndex = postorder.length-1;
        for(int i = 0 ; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return helper(postorder, 0, postorder.length-1);
    }
    TreeNode helper(int[] postorder, int start, int end){
        if(start > end){
            return null;
        }
        int nodeValue = postorder[postOrderIndex--];
        TreeNode node = new TreeNode(nodeValue);
        if(start == end){
            return node;
        }
        int index = map.get(nodeValue);
        node.right = helper(postorder, index+1, end);
        node.left = helper(postorder, start, index-1);
        return node;
    }
}
