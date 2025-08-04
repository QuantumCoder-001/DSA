package array.Hashing;
import java.util.HashMap;
import java.util.Map;

public class Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Map<Character,Character> map = new HashMap<>();
        int i = 0;
        for (Character ch: first){
            if(! map.containsKey(ch)){
                if(! map.containsValue(second[i])){
                    map.put(ch, second[i]);
                }
                else{
                    return false;
                }
            }
            else{
                if(second[i] != map.get(ch)){
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}
