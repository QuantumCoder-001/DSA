package array.Binary_Search;

interface MountainArray {
    public int get(int index);
    public int length();
}

public class Find_in_Mountain_Array {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int low = 0;
        int high = n-1;
        while(low < high){
            int mid = low + (high-low)/2;
            if(mountainArr.get(mid) < mountainArr.get(mid+1)){
                low = mid+1;
            }
            else {
                high = mid;
            }
        }
        int peak = low;
        int index = findTarget(target, mountainArr, 0, peak, true);
        if(index != -1){
            return index;
        }
        else{
            return findTarget(target, mountainArr, peak+1, n-1, false);
        }

    }
    public int findTarget(int target, MountainArray mountainArr, int low, int high, boolean asc){
        while(low <= high){
            int mid = low + (high-low)/2;
            int val = mountainArr.get(mid);
            if(val == target){
                return mid;
            }
            else if(asc){
                if(val < target){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            else{
                if(val < target){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
        }
        return -1;
    }
}
