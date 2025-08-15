package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS_LevelOrder_II {
    static List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> bigList = new ArrayList<>();
        if(root == null){
            return bigList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> smallList = new ArrayList<>();
            for(int i = 0; i<n; i++){
                TreeNode currentNode = queue.poll();
                smallList.add(currentNode.data);
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
            }
            bigList.addFirst(smallList);
        }
        return bigList;
    }
}
