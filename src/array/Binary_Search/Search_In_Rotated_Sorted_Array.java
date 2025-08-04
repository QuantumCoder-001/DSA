package array.Binary_Search;

public class Search_In_Rotated_Sorted_Array {
    public int search(int[] nums, int target){
        int n = nums.length-1;
        int low = 0;
        int high = n;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[low] <= nums[mid]){
                if(target < nums[mid] && nums[low] <= target){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(target > nums[mid] && nums[high] >= nums[mid]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
