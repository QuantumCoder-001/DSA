package recursion.String;

public class Remove_Consecutive_Characters {
    public static String removeChars(String s){
        if(s.length() <= 1){
            return s;
        }
        if(s.charAt(0)==s.charAt(1)){
            return removeChars(s.substring(1));
        }
        else{
            String result = removeChars(s.substring(1));
            return s.charAt(0) + result;
        }

    }
    public static void main(String[] args) {
        String s = "aaabbbcccdddc";
        System.out.println(removeChars(s));
    }
}

