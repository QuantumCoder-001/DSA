package array;

public class BinarySearch {
    static int search(int [] a, int target){
        int left = 0;
        int right = a.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(a[mid]==target){
                return mid;
            }
            else if(a[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {0,13,18,22,34,54,56,67,73,88,91};
        int target = 91;
        int g = search(a,target);
        System.out.print(g);
    }
}
