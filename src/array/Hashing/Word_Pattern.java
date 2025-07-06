package array.Hashing;

import java.util.HashMap;
import java.util.Map;

public class Word_Pattern {
    public static void main(String[] args) {

        String pattern = "abba";
        String  s = "cats cat cat cats";
        System.out.println(getWord(pattern,s));
    }
    public static boolean getWord(String pattern, String s){

        Map<Character,String > map = new HashMap<>();
        char[] ss = pattern.toCharArray();
        String[] p  = s.split(" ");
        if(ss.length!=p.length){
            return false;
        }
        int i=0;
        for(Character x: ss){
            if(!map.containsKey(x)){
                if(map.containsValue(p[i])){
                    return false;
                }
                map.put(x,p[i]);
            }
            else if (!p[i].equals(map.get(x))) {
                return false;
            }
            i++;
        }
        return true;
    }
}
