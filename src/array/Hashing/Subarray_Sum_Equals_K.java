package array.Hashing;

import java.util.HashMap;

public class Subarray_Sum_Equals_K {
    public int subarraysum(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0, sum = 0;
        for(int i : nums){
            sum += i;
            if(map.containsKey(sum - k)){
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0) +1);
        }
        return count;
    }
}
