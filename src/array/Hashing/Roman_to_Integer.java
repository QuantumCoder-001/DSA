package array.Hashing;

import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer {
    public int convertRoman(String s){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int i = 0;
        int n = s.length();
        int sum = 0;
        while(i < n){
            int currentValue = map.get(s.charAt(i));
            int nextValue = 0;
            if(i+1 < n){
                nextValue = map.get(s.charAt(i+1));
            }
            if(currentValue < nextValue){
                sum += (nextValue - currentValue);
                i += 2;
            }
            else{
                sum += currentValue;
                i++;
            }
        }
        return sum;

    }
}
