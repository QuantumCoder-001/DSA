package recursion.Integer;

public class Count_Even_Odd_In_Number {
    public static void count(int num, int odd, int even){
        if(num == 0){
            System.out.println("Odd:"+odd+" Even:"+even);
            return;
        }
        int digit = num%10;
        if(digit%2 == 0){
            even+=1;
        }
        else {
            odd+=1;
        }
        count(num/10,odd,even);
    }
    public static void main(String[] args) {
        count(4832,0,0);
    }
}
