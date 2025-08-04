package array.TwoPointers;

public class Sort_Colors {
    static void getColors(int[] a) {
        int low = 0;
        int mid = 0;
        int high = a.length - 1;
        while (mid<= high) {
            if (a[mid] == 0) {
                swapit(a, low, mid);
                low++;
                mid++;
            }
            else if (a[mid] == 2) {
                swapit(a, mid, high);
                high--;
            }
            else {
                mid++;
            }
        }
    }
    static void swapit(int[] x, int y , int z){
            int temp = x[y];
            x[y] = x[z];
            x[z] = temp;
    }

    public static void main(String[] args) {
        int[] a = {1,2,0,1,1,1,2};
        getColors(a);
        for(int n : a){
            System.out.print(n+" ");
        }
    }
}
