package array.TwoPointers;
import java.util.Arrays;

public class Two_Sum_II {
    static int[] getSum(int[] a,int target){
        int[] ar = {-1,-1};
        int[] copy = Arrays.copyOf(a, a.length);
        Arrays.sort(copy);

        int left = 0;
        int right = a.length-1;
        int findex = -1;
        int sindex = -1;
        while(right>left){
            int sum = copy[right] + copy[left];
            if (sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
            else{
                findex = copy[left];
                sindex = copy[right];
                break;
            }
        }
        return ar;
    }
}

