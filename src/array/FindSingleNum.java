package array;

import java.util.Arrays;

public class FindSingleNum {
    static int getNum(int [] nums){
       int x = 0;
       for(int val : nums){
           x^=val;
       }
        return x;

    }
    public static void main(String[] args) {
        int[] a = {2,2,1};
        int x = getNum(a);
        System.out.println(x);
    }
}
