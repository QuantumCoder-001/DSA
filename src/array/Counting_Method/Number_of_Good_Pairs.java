package array.Counting_Method;

import java.util.HashMap;
import java.util.Map;

public class Number_of_Good_Pairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            count += map.getOrDefault(n, 0);
            map.put(n, map.getOrDefault(n, 0) +1);
        }
        return count;
    }
}
