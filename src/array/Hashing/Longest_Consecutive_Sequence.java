package array.Hashing;

import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for(int num : nums){
            set.add(num);
        }
        for(int current : set){
            int x = current;
            if(!set.contains(x-1)){
                int count = 1;
                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                max = Math.max(count,max);
            }
        }
        return max;
    }
}
