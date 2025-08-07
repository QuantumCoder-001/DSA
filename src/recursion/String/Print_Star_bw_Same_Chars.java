package recursion.String;

public class Print_Star_bw_Same_Chars {
    public static String printStars(String s){
        if(s.length() <= 1){
            return s;
        }
        if(s.charAt(0) == s.charAt(1)){
            String result = printStars(s.substring(1));
            return s.charAt(0) + "*" + result;
        }
        else{
            String result = printStars(s.substring(1));
            return s.charAt(0) + result;
        }
    }
    public static void main(String[] args) {
        String s = "AABB";
        String res = printStars(s);
        System.out.println(res);
    }
}
