package array.Binary_Search;

import java.util.*;
public class IntersectionofArray {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int[] temp = new int[Math.min(nums1.length,nums2.length)];
        for(int n : nums1){
            set.add(n);
        }
        int count  = 0;
        for(int n:nums2){
            if(set.contains(n)){
                temp[count++] = n;
                set.remove(n);
            }
        }
        return Arrays.copyOf(temp,count);
    }
    public static void main(String[] args) {
        int[] num1 = {1,2,2,1,5};
        int[] num2 = {2,2,3,5,44,32};
        int[] x = intersection(num1, num2);
        for(int h : x){
            System.out.println(h);
        }
    }
}
