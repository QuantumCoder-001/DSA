package recursion.Integer;

public class Permutation {
    public static void permute(String s, String result){
        if(s.isEmpty()){
            System.out.println(result);
            return;
        }
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            String remaining = s.substring(0,i) + s.substring(i+1);
            permute(remaining,result+current);
        }

    }
    public static void main(String[] args) {
        permute("abc","");
    }
}
