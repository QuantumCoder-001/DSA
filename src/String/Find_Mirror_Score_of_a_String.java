package String;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public static long calculateScore(String s) {
        int n = s.length();
        long score = 0;
        Deque<Integer>[] stacks = new Deque[26];
        for(int i = 0; i < 26; i++){
            stacks[i] = new ArrayDeque<>();
        }
        for(int i = 0; i < n; i++){
            int charVal = s.charAt(i) - 'a';
            int mirror = 25 - charVal;

            if(!stacks[mirror].isEmpty()){
                int j = stacks[mirror].pop();
                score += (i - j);
            }
            else{
                stacks[charVal].push(i);
            }
        }
        return score;
    }

    public static void main(String[] args) {
        long score = calculateScore("aczzx");
        System.out.println(score);
    }
}
