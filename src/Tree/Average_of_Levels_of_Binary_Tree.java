package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Average_of_Levels_of_Binary_Tree {
    List<Double> averageOfLevels(TreeNode root){
        List<Double> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            long sum = 0;
            double avg = 0.0;
            for(int i = 0; i<n; i++){
                TreeNode node = queue.poll();
                sum += node.data;
                if(root.left != null){
                    queue.add(root.left);
                }
                if(root.right != null){
                    queue.add(root.right);
                }
            }
            avg = (double) sum/n;
            result.add(avg);
        }
        return result;
    }
}
