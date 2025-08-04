package array.TwoPointers;

public class Remove_Element {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int res = removeElement(nums, val);}

        public static int removeElement(int[] nums, int val){
        int n = nums.length;
        int write = 0;
        for(int read = 0; read < n; read++){
            if(nums[read] != val){
                nums[write] = nums[read];
                write++;
            }
        }
        return write;
    }
}
