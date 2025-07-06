package array.Sliding_Window;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringwithout_RepeatingChars {
    public static void main(String[] args) {
        String s = "abcdabbcb";
        System.out.println(get(s));
    }
    static int get(String s){
        int max = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();

        for(int right = 0; right<s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(right - left +1,max);

        }
        return max;
    }
}
