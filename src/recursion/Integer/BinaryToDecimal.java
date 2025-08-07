package recursion.Integer;

public class BinaryToDecimal {
    public static void convert(int num, int pow, int sum){
        if(num == 0){
            System.out.println(sum);
            return;
        }
        int digit = num%10;
        sum += digit * (int) Math.pow(2, pow);
        convert(num/10,pow+1,sum);
    }
    public static void main(String[] args) {
        convert(1010,0,0);
    }
}
