package array;

public class Max_Score_from_Subarray_Mins {
    public int maxSum(int[] arr) {
        // code here
        int maximumSum = 0;
        for(int i = 0; i < arr.length-1; i++){
            int sum = arr[i] + arr[i+1];
            maximumSum = Math.max(sum,maximumSum);
        }
        return maximumSum;
    }
}
