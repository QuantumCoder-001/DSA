package array.MergeIntevrvals;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] interval = {{1,2},{3,5},{6,7},{8,10},{12,16}};

        int[] add = {4,8};
        int[][] res =  insert(interval,add);
        for (int[] r : res) {
            System.out.println("[" + r[0] + ", " + r[1] + "]");
        }
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int n = intervals.length;
        int i = 0;

        while ((i < n) && (intervals[i][1] < newInterval[0])) {
            list.add(intervals[i]);
            i++;
        }
        while((i<n) && (intervals[i][0]<=newInterval[1])){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        list.add(newInterval);
        // Step 3: Add remaining intervals (no overlap)
        while (i < n) {
            list.add(intervals[i]);
            i++;
        }
        return list.toArray(new int[list.size()][]);
    }
}
