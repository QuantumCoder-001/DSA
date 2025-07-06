package array;

public class removeDuplicateSorted {
    static int remDup(int[] nums){
        int write = 0;
        for(int read = 1; read<nums.length;read++){
            if(nums[read]!=nums[write]){
                write++;
                nums[write] = nums[read];
            }
        }
        return write+1;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,2};
        int y = remDup(nums);
        System.out.println(y);
    }
}
