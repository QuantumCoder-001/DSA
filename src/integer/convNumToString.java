package integer;

public class convNumToString {
    static String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    static void conv(int n){
        if(n<=0){
            return;
        }
        conv(n/10);
        int r =(n%10);
        System.out.print(arr[r]+" ");

    }
    public static void main(String[] args) {
        conv(43);
    }
}
