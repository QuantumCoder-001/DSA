package array.PreComputation;

public class ProductofArray_ExceptSelf {

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] res = getExceptSum(a);
        for(int q : res){
            System.out.print(q+" ");
        }
    }
    static int[] getExceptSum(int[] a){
        int n = a.length;
        int[] ans = new int[n];
        int[] leftSum = new int[n];
        leftSum[0] = 1;
        int[] rightSum = new int[n];
        rightSum[n-1] = 1;
        for(int i = 1; i<n; i++){
            leftSum[i] = leftSum[i-1] * a[i-1];
        }
        for(int j = n-2; j>=0; j--){
            rightSum[j] = rightSum[j+1] * a[j+1];
        }
        for(int k = 0; k<n; k++){
            ans[k] = rightSum[k] * leftSum[k];
        }
        return ans;
    }
}
