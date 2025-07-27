package array;

public class Merge_Two_Arrays {
    public void sorted(int[] a, int[] b, int k){
        int n = a.length;
        int m = b.length;
        int[] res = new int[n+m];
        int i = 0, j = 0, index = 0;

        while(i < n && j < m){
            if(a[i] < b[j]){
                res[index] = a[i];
                i++;
            }
            else{
                res[index] = b[j];
                j++;
            }
            index++;
        }
        while(i < n){
            res[index] = a[i];
            i++;
            index++;
        }
        while(j < m){
            res[index] = b[j];
            j++;
            index++;
        }
    }
}
