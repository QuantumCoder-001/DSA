package Tree;

import java.util.*;

public class Top_View {
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
            Queue<Pair> queue = new LinkedList<>();
            queue.add(new Pair(root, 0));
            while (!queue.isEmpty()){
                Pair pair = queue.poll();
                TreeNode currentNode = pair.node;
                int dist = pair.hd;
                if(map.get(dist) == null){
                    map.put(dist, currentNode.data);
                }
                if(currentNode.left != null){
                    queue.add(new Pair(currentNode.left, dist-1));
                }
                if(currentNode.right != null){
                    queue.add(new Pair(currentNode.right, dist+1));
                }
            }
            for(int v : map.values()){
                result.add(v);
            }
            return result;
        }
    }
}
