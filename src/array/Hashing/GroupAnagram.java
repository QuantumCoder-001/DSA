package array.Hashing;
import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {

        String[] a = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res = ana(a);
        System.out.println(res);
    }
    public static List<List<String>> ana(String[] a){

        List<List<String>> l = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();

        for(String s : a){
           char[] w = s.toCharArray();
            Arrays.sort(w);
            String key = new String(w);
            map.computeIfAbsent(key, k-> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
