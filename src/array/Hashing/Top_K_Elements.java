package array.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Top_K_Elements {
    public int[] getTopKElements(int[] nums,int k){
        int[] res = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((first, second) -> first.getValue().equals(second.getValue()) ?
                second.getKey().compareTo(first.getKey()) : second.getValue().compareTo(first.getValue()));

        int i = 0;
        for (Map.Entry<Integer,Integer> m : list){
            if(i<k){
                int key = m.getKey();
                res[i] = key;
                i++;
            }
        }
        return res;
    }
}
