package Tree;

import java.util.*;

public class Zigzag_Level_Order_Traversal {
    List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> bigList = new ArrayList<>();
        if(root == null){
            return bigList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            int n = queue.size();
            level++;
            List<Integer> smallList = new ArrayList<>();
            for(int i = 0; i<n; i++){
                TreeNode node = queue.peek();
                smallList.add(node.data);
                if(root.left != null){
                    queue.add(root.left);
                }
                if(root.right != null){
                    queue.add(root.right);
                }
            }
            if(level % 2 != 0){
                Collections.reverse(smallList);
            }
            bigList.add(smallList);
        }
        return bigList;
    }
}
