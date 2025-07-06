package array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] x = reversedArray(arr);
        for(int i : x){
            System.out.print(" "+i);
        }
    }
    public static int[] reversedArray(int[] arr){
        int size = arr.length-1;
        for (int i = 0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[size];
            arr[size] = temp;
            size--;
        }
        return arr;
    }
}
