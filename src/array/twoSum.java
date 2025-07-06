package array;
import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    static int[] getSum(int[] a,int target){
        int[] ar = {-1,-1};
        int[] copy = Arrays.copyOf(a, a.length);
        Arrays.sort(copy);

        int left = 0;
        int right = a.length-1;
        int findex = -1;
        int sindex = -1;
        while(right>left){
            int sum = copy[right] + copy[left];
            if (sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
            else{
                findex = copy[left];
                sindex = copy[right];
                break;
            }
        }
        for(int i = 0; i<a.length; i++){
            if((a[i] == findex) && (ar[0] ==-1)){
                ar[0] = i;
            }
            else if((a[i] == sindex) && (ar[1]==-1)){
                ar[1] = i;
            }
            if((ar[0]!=-1) && (ar[1]!=-1)){
                break;
            }
        }
        return ar;
    }
    static int[] get(int [] a, int target){
        int[] pair = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<a.length; i++){
            int res = target - a[i];
            if(map.get(res)!=null){
                pair[0] = map.get(res);
                pair[1] = i;
            }
            else{
                map.put(a[i], i);
            }
        }
        return pair;
    }
    public static void main(String[] args) {
        int[] a = {5,2,3,6,9,5,11};
        int target = 10;
        int [] x = getSum(a, target);
        for(int i : x){
        System.out.print(i+" ");
        }
        System.out.println();
        int [] y = get(a,target);
        for(int j : y){
            System.out.print(j+" ");
        }
    }
}
