package array.TwoPointers;

public class TotalWater {
    static int rainWater(int[] height){
        int max = 0;
        int left = 0;
        int leftMax = 0;
        int right = height.length-1;
        int rightMax = 0;
         while (left<right){
             if(height[left]<height[right]){
                 if(height[left]>=leftMax){
                     leftMax = height[left];

                 }
                 else{
                     max += leftMax - height[left];
                 }
                 left++;
             }
             else{
                 if(height[right]>=rightMax){
                     rightMax = height[right];

                 }
                 else{
                     max += rightMax - height[right];
                 }
                 right--;
             }
         }
        return max;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int x = rainWater(height);
        System.out.print(x);
    }
}
