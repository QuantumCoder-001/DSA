package array.Sliding_Window;

import java.util.HashMap;

public class Fruit_Into_Baskets {
    public int totalFruits(int[] fruits){
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for(int right = 0; right<fruits.length; right++){
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) +1);
            while(map.size() > 2){
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if(map.get(fruits[left]) == 0){
                    map.remove(left);
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
