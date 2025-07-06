package recursion;

class RecTablePrint {
//    static void print(int n,int m){
//        if(m==0){
//            return;
//        }
//        print(n,m-1);
//        System.out.println(n+" * "+m+" = "+n*m);
//    }
    static String print(int n, int m){
        if(m==0){
            return "";
        }
        print(n,m-1);
        String old = print(n,m-1);
        String neww = n+" * "+m+" = "+(n*m)+"\n";
        return old + neww;
    }
    public static void main(String[] args) {
        String str= (print(5,3));
        System.out.println(str);
    }
}
