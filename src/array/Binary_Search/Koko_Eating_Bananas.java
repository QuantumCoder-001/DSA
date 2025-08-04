package array.Binary_Search;

public class Koko_Eating_Bananas {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length-1;
        int low = 1;
        int high = 1;
        for(int num : piles){
            if(num > high){
                high = num;
            }
        }
        while(low < high){
            int mid = low + (high-low)/2;
            int hours = countHours(piles,mid);
            if(hours > h){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
    public int countHours(int[] nums, int hours){
        int totalHours = 0;
        for(int num : nums){
            if(hours >= num){
                totalHours++;
            }
            else{
                totalHours += (num + hours - 1) / hours;
            }
        }
        return totalHours;
    }
}
