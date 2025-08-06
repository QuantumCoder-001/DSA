package array.Sliding_Window;
public class Longest_SubArray {
    public static void main(String[] args) {
        int sum = 8;
        int[] a = {3, 2, 3, 7, 4, 1, 7, 2, 8};
        int max = 0;
        int left = 0;
        int currentSum = 0;
        int right;
        for (right = 0; right < a.length; right++) {
            currentSum += a[right];
            while (sum < currentSum) {
                currentSum -= a[left];
                left++;
            }
            max = Math.max(right-left+1,max);
        }
        System.out.println(max);
    }
}
