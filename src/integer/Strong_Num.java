package integer;

public class Strong_Num {
    static int fact(int digit){
        int res = 1;
        while (digit>1){
            res*=digit;
            digit--;
        }
        return res;
    }
    public static void main(String[] args) {
        int num = 4058;
        int sum = 0;
        int copy = num;
        int digit = 0;
        while(copy>0){
            digit = copy%10;
            sum += fact(digit);
            copy/=10;
        }
        System.out.println(sum==num?"Strong Number":"Not Strong Number");
    }
}
