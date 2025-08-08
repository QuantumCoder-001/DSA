package recursion.Tree;

public class Nth_Fibonacci {
    public static int fibo(int n){
        if (n <= 1){
            return n;
        }
        int first = fibo(n-1);
        int second = fibo(n-2);
        return first + second;
    }
    public static void main(String[] args) {
        int result = fibo(8);
        System.out.println(result);
    }
}
