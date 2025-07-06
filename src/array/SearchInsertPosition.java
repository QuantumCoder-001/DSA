package array;

public class SearchInsertPosition {
        static int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length-1;
            while(left<=right){
                int mid = left + (right-left)/2;
                if(nums[mid] == target){
                    return mid;
                }
                else if(nums[mid]>target){
                    right = mid-1;
                }
                else {
                    left = mid + 1;
                }
            }
            return left;
        }
    public static void main(String[] args) {
        int[] a = {1,3,4,6};
        int target = 2;
        int j = searchInsert(a, target);
        System.out.print(j);
    }
}

