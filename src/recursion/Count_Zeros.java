package recursion;

public class Count_Zeros {
    public static void countZeros1(int num, int count){
        if(num <= 0){
            System.out.println(count);
            return;
        }
        int digit = num%10;
        if(digit==0){
            count++;
        }
        countZeros1(num/10, count);
    }
    public static int countZeros2(int num){
        if(num <= 0){
            return 0;
        }
        int count = countZeros2(num/10);
        int digit = num%10;
        return count + (digit == 0? 1: 0);
    }

    public static void main(String[] args) {
        countZeros1(1040, 0);
        System.out.println(countZeros2(1020));
    }
}
