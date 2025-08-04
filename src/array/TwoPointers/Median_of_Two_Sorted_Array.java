package array.TwoPointers;

public class Median_of_Two_Sorted_Array {
    public double getMedian(int[] nums1, int[] nums2){
        int i = 0;
        int j = 0;
        int n = nums1.length;
        int m = nums2.length;
        int[] res = new int[n+m];
        int index = 0;
        while(i < n && j < m){
            if(nums1[i]<nums2[j]){
                res[index] = nums1[i];
                i++;
            }
            else{
                res[index] = nums2[j];
                j++;
            }
            index++;
        }
        while(i < n){
            res[index] = nums1[i];
            i++;
            index++;
        }
        while(j < m){
            res[index] = nums2[j];
            j++;
            index++;
        }
        if(res.length % 2 == 0){
            return (res[(res.length/2)-1] + res[res.length/2])/2.0;
        }
        else{
            return res[res.length/2];
        }
    }
}
