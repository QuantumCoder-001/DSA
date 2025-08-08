package recursion.Tree;

public class Sub_Sequence {
    public static void subSequence(String s, String result){
        if(s.isEmpty()){
            System.out.println(result);
            return;
        }
        subSequence(s.substring(1),result);
        subSequence(s.substring(1), result + s.charAt(0));
    }
    public static void main(String[] args) {
        subSequence("abc","");
    }
}
