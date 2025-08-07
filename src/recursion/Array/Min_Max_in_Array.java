package recursion.Array;

public class Min_Max_in_Array {
    public static void minMax1(int[] arr,int index, int min, int max){
        if(index == arr.length){
            System.out.println("Max:"+max+" Min:"+min);
            return;
        }
        if(arr[index] > max){
            max = arr[index];
        }
        if(arr[index] < min){
            min = arr[index];
        }
        minMax1(arr,index+1,min,max);
    }
    public static int[] minMax2(int[] arr, int index){
        if(arr.length == index){
            int[] res = new int[2];
            res[0] = Integer.MAX_VALUE;
            res[1] = Integer.MIN_VALUE;
            return res;
        }
        int[] res = minMax2(arr,index+1);
        // Max Element
        if(res[1] < arr[index]){
            res[1] = arr[index];
        }
        // Min Element
        if(res[0] > arr[index]){
            res[0] = arr[index];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {23,64,84,55,39,93,19};
        minMax1(arr,0,arr[0],arr[0]);
        int[] result = minMax2(arr,0);
        System.out.println("Max:"+result[1]+" Min:"+result[0]);
    }
}
