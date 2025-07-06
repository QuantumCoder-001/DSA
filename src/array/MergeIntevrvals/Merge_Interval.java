package array.MergeIntevrvals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Interval {
    public static void main(String[] args) {
        int[][] a = {{1,3},{2,6},{8,10},{12,16}};
        int[][] res = merge(a);
        for(int[] i : a){
            for( int j : i){
                System.out.print(j+" ");
            }
        }
    }
    static int[][] merge(int[][] intervals){
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, (a, b) ->Integer.compare(a[0],b[0]));
        for(int[] interval : intervals){
            if((result.isEmpty()) || (result.getLast()[1]<interval[0])){
                result.add(interval);
            }
            else{
                result.getLast()[1] = Math.max(result.getLast()[1],interval[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
