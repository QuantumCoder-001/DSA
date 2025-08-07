package recursion.Integer;

public class palindrome {
    static void palindromeNumber1(int num, int reverse, int copy){
        if(num <= 0){
            System.out.println(copy == reverse? "Palindrome": "Not Palindrome");
            return;
        }
        int digit = num % 10;
        reverse = reverse*10 + digit;
        palindromeNumber1(num/10,reverse, copy);
    }
    static boolean palindromeNumber2(int num, int reverse, int copy){
        if(num <= 0){
            return copy == reverse;
        }
        int digit = num % 10;
        reverse = reverse*10 + digit;
        return palindromeNumber2(num/10,reverse, copy);
    }

    public static void main(String[] args) {
        int num = 151;
        palindromeNumber1(num, 0, num);
        System.out.println(palindromeNumber2(num,0,num));
    }
}
