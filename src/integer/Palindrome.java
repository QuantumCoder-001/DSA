package integer;

public class Palindrome{
    public static void main(String[] args) {
        int x = 121;
        int copy = x;
        int n = 0;
        while(x > 0){
            int rem = x % 10;
            n = n * 10 + rem;
            x /= 10;
        }
        System.out.println(n+" "+ copy);
    }
}