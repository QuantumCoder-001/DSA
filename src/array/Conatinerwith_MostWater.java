package array;

class Conatinerwith_MostWater {
    static int maxArea(int[] height) {
        int max = 0;
        int right = height.length-1;
        int left = 0;
        while(left<=right){
            int min = Math.min(height[left], height[right]);
            int area  = (right-left)*min;
            max = Math.max(max, area);
            if(height[left]>=height[right]){
                right--;
            }
            else {
                left+=1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,3,3,7};
        int maxy = maxArea(height);
        System.out.print(maxy);
    }
}

