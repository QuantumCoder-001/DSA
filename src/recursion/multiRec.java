package recursion;

public class multiRec {
    static void rec(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        rec(n-1);
        rec(n-2);
        rec(n-3);
    }
    public static void main(String[] args) {

        rec(3);
    }
}
