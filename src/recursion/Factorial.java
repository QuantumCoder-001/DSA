package recursion;

public class Factorial {
    public static void fact1(int num,int sum){
        if(num <= 0){
            System.out.println(sum);
            return;
        }
        fact1(num-1,sum*num);
    }
    public static int fact2(int num){
        if (num == 1){
            return 1;
        }
        int sum = fact2(num-1);
        sum *= num;
        return sum;
    }
    public static void main(String[] args) {
        fact1(3,1);
        System.out.println(fact2(3));
    }
}
