package array.Hashing;

import java.util.HashMap;
import java.util.Map;

public class Contiguous_Array {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int max = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i = 0; i < nums.length; i++){
            sum += (nums[i] == 0)? -1: 1;
            if(map.containsKey(sum)){
                int prev = map.get(sum);
                int length = i - prev;
                max = Math.max(max,length);
            }
            else{
                map.put(sum,i);
            }
        }
        return max;
    }
}
