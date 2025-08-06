package recursion;

public class SumofDigits {

    public static void main(String[] args) {

        getSum1(1234,0);
        System.out.println(getSum2(1234));
    }
    static void getSum1(int n, int sum){

        int digit = n%10;
        sum += digit;
        if(n == 0){
            System.out.println(sum);
            return;
        }
        getSum1(n/10,sum);
    }
    static int getSum2(int n){

        if(n == 0){
            return 0;
        }
        int sum = getSum2(n/10);
        int digit = n%10;
        sum += digit;
        return sum;
    }

}
