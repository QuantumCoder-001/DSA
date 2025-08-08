package recursion.Tree;

public class Josephus {
    public static int josephus(int k, int n){
        if(n == 1){
            return 0;
        }
        return (josephus(k,n-1)+k) % n;
    }
    public static void main(String[] args) {
        int k = 2;
        int n = 5;
        System.out.println(josephus(k,n));
    }
}
