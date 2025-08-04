package array.Hashing;

import java.util.HashMap;
import java.util.Map;

public class Contains_Duplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        if(k<1){
            return false;
        }
        int i = 0;
        for(int num : nums){
            if(! map.containsKey(num)){
                map.put(num, i);
            }
            else{
                if(Math.abs(map.get(num) - i) <= k){
                    return true;
                }
                map.put(num, i);
            }
            i++;
        }
        return false;
    }
}
