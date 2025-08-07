package recursion.Array;

public class Search_Element_in_Array {
    public static boolean isFound(int[] arr, int index, int element){
        if(index == arr.length){
            return false;
        }
        if(arr[index] == element){
            return true;
        }
        return isFound(arr,index+1,element);
    }
    public static void main(String[] args) {
        int[] arr = {23,64,84,55,39,93,19};
        boolean res = isFound(arr,0,55);
        System.out.println(res);
    }
}
