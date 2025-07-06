package array;

public class FindTheDiff {
    static char diff(String s, String t){
        char r = 0;
        for(char e : s.toCharArray()){
            r = (char)(r^e);
        }
        for(char q : t.toCharArray()){
            r = (char)(r^q);
        }
        return r;
    }
    public static void main(String[] args) {
        String s = "abc";
        String t ="abcd";
        char x = diff(s,t);
        System.out.println(x);
    }
}
