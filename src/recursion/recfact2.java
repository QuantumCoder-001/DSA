package recursion;

public class recfact2 {
    static int fact(int n) {

        if (n == 1) {
            return n ;

        }
        int r = fact(n-1);
        return r*n;

    }
        public static void main (String[]args){
            int res = fact(3);
            System.out.println(res);
        }
    }
