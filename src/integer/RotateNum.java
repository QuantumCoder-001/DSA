package integer;

public class RotateNum {
    public static void main(String[] args) {
        int num = 1234;
        int num1  = num;
        int i=-1;
        while(num>0){
            num/=10;
            i++;
        }
        int rotate = 4;
        while(rotate>0){
            int lastDigit =num1%10;
            lastDigit*=(int)Math.pow(10,i);
            int rest = num1/10;
            num1 = lastDigit+rest;
            rotate--;
        }
        System.out.println(num1);
    }
}
