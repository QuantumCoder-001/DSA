package array;

import java.util.ArrayList;

public class First_LastOccuranceGFG {

    public static void main(String[] args) {

        int[] a = {22,4,77,3,11,88,55,3,77,21,77};
        int target = 77;
        int[] res = getFirst_Last(a,target);
        for(int r : res){
            System.out.println(r);
        }
    }

    // For Unsorted
    public static int[] getFirst_Last(int[] a, int t){

        int[] n = {-1,-1};

        for(int i=0; i<a.length;i++){
            if(a[i] == t && n[0]==-1){
                n[0]=i;
            }
            if(a[i] == t){
                n[1]=i;
            }
        }
        return n;
    }
    // For Sorted Using BinarySearch
    public static int[] get_First_Last(int[] a, int t) {
        int[] n = {-1, -1};
        n[0] = SearchTarget(a, t, true);
        n[1] = SearchTarget(a, t, false);
        return n;
    }
    public static int SearchTarget(int[] nums, int target, boolean isFirst){
        int low = 0;
        int index = -1;
        int high = nums.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                index = mid;
                if(isFirst) high = mid-1;
                else low = mid+1;
            }
            else if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return index;
    }
}
