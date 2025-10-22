package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KDistance {
    ArrayList<Integer> Kdistance(TreeNode root, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()){
            int n = queue.size();
            if(level == k){
                for(int i = 0; i<n; i++){
                    TreeNode node = queue.poll();
                    result.add(node.data);
                }
                return result;
            }
            for(int i = 0; i<n; i++){
                TreeNode node = queue.poll();
                if(root.left != null){
                    queue.add(root.left);
                }
                if(root.right != null){
                    queue.add(root.right);
                }
            }
            level++;
        }
        return result;
    }
}
