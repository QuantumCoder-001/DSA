package recursion;

public class PrintTable {
    public static void printTable1(int num, int val){
        if(val <= 0) {
            return;
        }
        printTable1(num, val-1);
        System.out.println(num+" * "+val +" = "+(num*val));
    }
    public static String printTable2(int num, int val){
        if(val <= 0){
            return "";
        }
        String res = printTable2(num, val-1);
        String exp = num+" * "+val +" = "+(num*val)+"\n";
        return res + exp;
    }
    public static void main(String[] args) {
        printTable1(5,10);
        System.out.println(printTable2(5,10));
    }
}
