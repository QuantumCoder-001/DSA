package integer;

public class swapwithposition {

    public static void main(String[] args) {

        int num = 32145;
        int temp = 0;
        int sum = 0;
        int i = 1;
        while(num>0){
            temp=i;
            sum += i*(int)Math.pow(10,num%10-1);
            num/=10;
            i++;
        }
        System.out.println(sum);
    }
}