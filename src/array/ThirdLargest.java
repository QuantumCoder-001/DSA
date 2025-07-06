package array;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {23,74,32,76,87};
        int y = getThirdLargest(arr);
        System.out.println(y);
    }
    public static int getThirdLargest(int[] arr){
        int max1 = -1;
        int max2 = -1;
        int max3 = -1;
        for (int i : arr){
            if(i>max1){
                max3 = max2;
                max2 = max1;
                max1 = i;
            }
            else if(i>max2 && i<max1){
                max3 = max2;
                max2 = i;
            }
            else if(i>max3 && i<max2){
                max3 = i;
            }
        }
        return max3;
    }
}
