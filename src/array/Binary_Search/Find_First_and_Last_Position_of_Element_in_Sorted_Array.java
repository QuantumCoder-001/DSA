package array.Binary_Search;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        result[0] = find(nums, target, true);
        result[1] = find(nums, target, false);
        return result;
    }
    public int find(int[] nums, int target, boolean isFirst){
        int low = 0;
        int index = -1;
        int high = nums.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                index = mid;
                if (isFirst) high = mid - 1;
                else low = mid + 1;
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
