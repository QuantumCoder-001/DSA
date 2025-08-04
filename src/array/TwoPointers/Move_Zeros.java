package array.TwoPointers;


public class Move_Zeros {
    static void moveZeros(int [] a){
        int write = 0;
            for(int read = 0; read<a.length; read++) {
                if (a[read] != 0) {
                    a[write] = a[read];
                    write++;
                }
            }
            for(int i = write; i<a.length;i++){
                a[i] = 0;
            }
        }
    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        moveZeros(a);
        for(int n: a){
            System.out.print(n+" ");
        }
        String s = "abc";
        char[] y = s.toCharArray();
        System.out.print(y[1]);


    }
}
