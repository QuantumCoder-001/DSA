package array;

import java.util.ArrayList;

public class First_LastOccuranceGFG {

    public static void main(String[] args) {

        int[] a = {22,4,77,3,11,88,55,3,77,21,77};
        int target = 77;
        int[] res = getFirst_Last(a,target);
        for(int r : res){
            System.out.println(r);
        }

    }
    public static int[] getFirst_Last(int[] a, int t){

        int[] n = {-1,-1};

        for(int i=0; i<a.length;i++){
            if(a[i] == t && n[0]==-1){
                n[0]=i;
            }
            else if(a[i] == t){
                n[1]=i;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.get(9);
        return n;
    }
}
