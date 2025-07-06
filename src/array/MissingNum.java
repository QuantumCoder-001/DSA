package array;

public class MissingNum {
    public static void main(String[] args) {
        int[] ar = {3,0,1,4,5,6,7,9,2};
        //int[] ar = {1,2,4,5};
        int num = get(ar);
        int d = getMissingNumber(ar);
        System.out.println(d);
        System.out.println(num);
    }
    public static int getMissingNumber(int[] ar){
        int x = 0;
        int sum1 = 0;
        for(int i : ar){
            sum1 += i;
        }
        int sum2 = 0;
        int size = ar.length;
        for(int j=1; j<=size; j++){
            sum2 += j;
        }
        x = sum2 - sum1;
    return x;
    }
    public static int get(int[] ar){
        int x = 0;
        for(int n : ar){
            x^=n;
        }
        for(int i = 1; i<=ar.length;i++){
            x^=i;
        }
        return x;
    }
}
