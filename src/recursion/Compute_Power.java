package recursion;

public class Compute_Power {
    public static void computePower1(int num, int power, int result){
        if(power == 0){
            System.out.println(result);
            return;
        }
        computePower1(num,power-1, num*result);
    }
    public  static int computePower2(int num, int power){
        if(power == 1){
            return num;
        }
        int res = computePower2(num, power-1);
        return res * num;
    }
    public static void main(String[] args) {
        computePower1(2,3,1);
        System.out.println(computePower2(2,3));
    }
}
