package recursion;

public class palindrome {
    public static void main(String[] args) {
        getpalin(121,0,121);
        System.out.println(getpalin2(121,0,121)?"Palindrome":"Not Palindrome");
    }
    static void getpalin(int n, int rev, int cpy) {
        if (n == 0) {
            System.out.println(rev == cpy ? "Palindrome" : "Not Palindrome");
            return;
        }
        int digit = n % 10;
        rev = rev * 10 + digit;
        getpalin(n / 10, rev, cpy);
    }
    static boolean getpalin2(int n, int rev,int cpy){
        if (n == 0) {
            return rev == cpy;
        }
        int digit = n % 10;
        rev = rev * 10 + digit;
        return getpalin2(n / 10, rev, cpy);
    }
}
