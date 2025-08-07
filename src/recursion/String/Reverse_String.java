package recursion.String;

public class Reverse_String {
    public static void reverseString1(String s, int index, String rev){
        if(index <= -1){
            System.out.println(rev);
            return;
        }
        rev+=s.charAt(index);
        reverseString1(s,index-1, rev);
    }
    public static String reverseString2(String s){
        if(s.isEmpty()){
            return "";
        }
        String res = reverseString2(s.substring(1));
        char first = s.charAt(0);
        return res + first;
    }

    public static void main(String[] args) {
        String s = "Bilal";
        reverseString1(s,s.length()-1, "");
        String rev = reverseString2("Bilal");
        System.out.println(rev);


    }
}
