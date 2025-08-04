package array.Binary_Search;

public class First_Last_Occurrence_GFG {
    public static void main(String[] args) {

        int[] a = {22,4,77,3,11,88,55,3,77,21,77};
        int target = 77;
        int[] res = getFirst_Last(a,target);
        for(int r : res){
            System.out.println(r);
        }
    }
    // For Unsorted
    public static int[] getFirst_Last(int[] a, int t){

        int[] n = {-1,-1};

        for(int i=0; i<a.length;i++){
            if(a[i] == t && n[0]==-1){
                n[0]=i;
            }
            if(a[i] == t){
                n[1]=i;
            }
        }
        return n;
    }
}
