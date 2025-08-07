package recursion.String;

public class Search_and_Replace {
    public static String searchAndReplace(String s, char search, char replace){
        if(s.isEmpty()){
            return "";
        }
        String x = searchAndReplace(s.substring(1), search, replace);
        if(s.charAt(0) == search){
            return replace + x;
        }
        return s.charAt(0) + x;
    }
    public static void main(String[] args) {
        String result = searchAndReplace("hello", 'l', 'x');
        System.out.println(result);
    }
}
