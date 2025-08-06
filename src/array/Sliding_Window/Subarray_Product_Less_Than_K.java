package array.Sliding_Window;

public class Subarray_Product_Less_Than_K {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        if(k <= 1){
            return 0;
        }
        int product = 1;
        int left = 0;
        int count = 0;
        for(int right = 0; right < n; right++){
            product *= nums[right];
            while(product >= k){
                product /= nums[left];
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }
}
