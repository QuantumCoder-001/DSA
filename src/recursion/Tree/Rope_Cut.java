package recursion.Tree;

public class Rope_Cut {
    public static int maxCut(int rope, int a, int b, int c){
        if(rope == 0){
            return 0;
        }
        if(rope < 0){
            return -1;
        }
        int p = maxCut(rope-a, a,b,c);
        int q = maxCut(rope-b, a,b,c);
        int r = maxCut(rope-c, a,b,c);
        int res = Math.max(p,Math.max(q,r));
        if (res == -1){
            return -1;
        }
        else{
            return res + 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(maxCut(5,2,5,1));
    }
}
