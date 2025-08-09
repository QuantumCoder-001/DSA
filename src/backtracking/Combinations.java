package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> bigList = new ArrayList<>();
        helper(n,k,1,smallList,bigList);
        return bigList;
    }
    static void helper(int n, int k, int index, List<Integer> smallList, List<List<Integer>> bigList){
        if(smallList.size() == k){
            bigList.add(new ArrayList<>(smallList));
            return;
        }
        for(int i = index; i<=n; i++){
            smallList.add(i);
            helper(n, k,i+1, smallList, bigList);
            smallList.remove(smallList.size()-1);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        List<List<Integer>> result = combine(n, k);
        System.out.println(result);
    }
}
