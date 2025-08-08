package recursion.Array;

public class Find_All_Occurrences {
    public static int[] findAll(int[] arr,int index, int target, int count){
        if(index == arr.length){
            return new int[count];
        }
        if(arr[index] == target){
            count++;
        }
        int[] res = findAll(arr, index+1, target, count);
        if(arr[index] == target){
            res[count-1] = index;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,50,60,70,50};
        int target = 50;
        int[] result = findAll(arr,0,target,0);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
