package array.Warmup;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {79,3,29,43,56};
        int x = getSecondLargest((arr));
        System.out.println(x);
    }
    public static int getSecondLargest(int[] arr){
        int max2 = -1;
        int max1 = -1;
        for (int j : arr) {
            if (j >= max1) {
                max2 = max1;
                max1 = j;
            }
            else if(j>max2 ){
                max2 = j;
            }
        }
        return max2;
    }
}
