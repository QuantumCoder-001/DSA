package array.Binary_Search;

public class Capacity_To_Ship_Packages_Within_D_Days {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;
        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }
        while(low < high){
            int mid = low + (high-low)/2;
            int day = countDays(weights, mid);
            if(days < day){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
    public int countDays(int[] weights, int capacity){
        int days = 1;
        int sum = 0;
        for(int w : weights){
            if(sum + w > capacity){
                days++;
                sum = 0;
            }
            sum += w;
        }
        return days;
    }
}
