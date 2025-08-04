package array.Binary_Search;

public class Single_Element_in_Sorted_Array {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length-1;
        int low = 0;
        int high = n;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(mid % 2 == 0){
                if(mid+1 < n && nums[mid] == nums[mid+1]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            else{
                if(nums[mid] == nums[mid-1]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return nums[low];
    }
}
