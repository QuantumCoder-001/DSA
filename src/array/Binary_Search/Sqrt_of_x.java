package array.Binary_Search;

public class Sqrt_of_x {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int low = 1;
        int high = x/2;
        while(low <= high){
            int mid = low + (high-low)/2;
            long sq = (long) mid*mid;
            if(x == sq){
                return mid;
            }
            else if(x > sq){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return high;
    }
}
