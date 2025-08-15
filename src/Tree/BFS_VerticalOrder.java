package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}


public class BFS_VerticalOrder {
    static List<List<Integer>> verticalTraversal(TreeNode root){
        List<List<Integer>> bigList = new ArrayList<>();
        TreeMap<Integer, List<Pair<Integer, Integer>>> map = new TreeMap<>();
        helper(map, 0, 0, root);
        for(Integer key : map.keySet()){
            List<Pair<Integer, Integer>> list = map.get(key);
            list.sort((a,b)-> a.getKey().compareTo(b.getKey()) == 0? a.getValue().compareTo(b.getValue()): a.getKey().compareTo(b.getKey()));
            List<Integer> smallList = new ArrayList<>();
            for(Pair<Integer, Integer> pair : list){
                smallList.add(pair.getValue());
            }
            bigList.add(smallList);
        }
        return bigList;

    }
    static void helper(TreeMap<Integer, List<Pair<Integer, Integer>>> map, int distance, int level, TreeNode root){
        if(root == null){
            return;
        }
        if(map.get(distance) == null){
            map.put(distance, new ArrayList<>());
        }
        map.get(distance).add(new Pair<>(level, root.data));
        helper(map, distance - 1, level + 1, root.left);
        helper(map, distance + 1, level + 1, root.right);
    }
}
