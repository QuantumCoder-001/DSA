package integer;

public class EvenOddSum {
    public static void main(String[] args) {
        int num = 11234;
        int odd_sum = 0;
        int even_sum = 0;
        int position = 0;
        while(num>0){
            if(position%2 == 0){
                even_sum+=num%10;
                num/=10;
            }
            else{
                odd_sum+=num%10;
                num/=10;
            }
            position++;
        }
        System.out.println("Even sum:"+even_sum);
        System.out.println("Odd sum:"+odd_sum);
    }
}
