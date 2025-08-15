package Tree;

import java.util.*;

public class Bottom_View {
    static class Pair{
        TreeNode node;
        int hd;
        Pair(TreeNode node, int hd){
            this.node = node;
            this.hd = hd;
        }
        static List<Integer> bottomView(TreeNode root){
            List<Integer> result = new ArrayList<>();
            if(root == null){
                return result;
            }
            Map<Integer, Integer> map = new TreeMap<>();
            Queue<Top_View.Pair> queue = new LinkedList<>();
            queue.add(new Top_View.Pair(root, 0));
            while (!queue.isEmpty()){
                Top_View.Pair pair = queue.poll();
                TreeNode currentNode = pair.node;
                int dist = pair.hd;
                map.put(dist, currentNode.data);
                if(currentNode.left != null){
                    queue.add(new Top_View.Pair(currentNode.left, dist-1));
                }
                if(currentNode.right != null){
                    queue.add(new Top_View.Pair(currentNode.right, dist+1));
                }
            }
            for(int v : map.values()){
                result.add(v);
            }
            return result;
        }
    }
}
