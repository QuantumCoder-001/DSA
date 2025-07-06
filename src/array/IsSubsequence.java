package array;

public class IsSubsequence {
    public static void main(String[] args) {
        String a = "ace";
        String b = "abcd";
        boolean res = getsubseq(a,b);
        System.out.println(res);
    }
    static boolean getsubseq(String a, String b){
     int i = 0;
     int j = 0;
     while(i<a.length() && j<b.length()){
         if(a.charAt(i) == b.charAt(j)){
            i++;
            j++;
         }
         else{
             j++;
         }
     }
     return i==a.length();
    }
}
