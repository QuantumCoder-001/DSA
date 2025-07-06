package array.PreComputation;

public class RunningSum_1DArray {
    public static void main(String[] args) {

        int[] a = {2,4,5,7,11,16};
        int[] res = getSum(a);
        for(int n : res){
            System.out.print(n+" ");
        }
    }
    static int[] getSum(int[] a){
        int[] prefix = new int[a.length];
        prefix[0] = a[0];
        for(int i = 1; i<a.length; i++){
            prefix[i] = prefix[i-1] + a[i];
        }
        return prefix;
    }
}
