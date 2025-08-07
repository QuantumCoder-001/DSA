package recursion.Integer;

public class ArmstrongNumber {
    public static int countDigits(int num){
        int count = 0;
        while(num != 0){
            count++;
            num/=10;
        }
        return count;
    }
    public static void isArmstrong1(int num, int sum, int copy, int power){
        if(num <= 0){
            if(sum == copy){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
            return;
        }
        int digit = num%10;
        sum += (int) Math.pow(digit, power);
        isArmstrong1(num/10,sum,copy, power);
    }

    public static int isArmstrong2(int num, int power){
        if(num <= 0){
            return 0;
        }
        int sum = isArmstrong2(num/10,power);
        sum += (int)Math.pow(num%10, power);
        return sum;
    }
    public static void main(String[] args) {
        int num = 153;
        int digits = countDigits(num);
        isArmstrong1(num,0,num,digits);
        int res = isArmstrong2(num,digits);
        if (res == num) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
