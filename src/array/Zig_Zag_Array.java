package array;

public class Zig_Zag_Array {
    public static void main(String[] args) {

        int[] arr = {4,3,7,8,6,2,1};
        //int[] arr = {1,4,3,2};
        int[] x = getZigZagged(arr);
        for(int j : x){
            System.out.print(" "+j);
        }
    }
    public static int[] getZigZagged(int[] arr){

        for(int i = 1; i< arr.length; i+=2){
            if(arr[i-1]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
            }
            if(i+1 <= arr.length-1){
                if(arr[i+1]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
}
