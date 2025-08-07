package recursion.Array;

public class isArraySorted {
    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        boolean res = isSorted(arr,0);
        System.out.println(res);
    }
}
