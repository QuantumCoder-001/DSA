package recursion;

public class Print1to5 {
    public static void main(String[] args) {
        printNum(12345);
    }
    static void printNum(int n){
        if(n == 0){
            return;
        }
        printNum(n/10);
        System.out.println(n%10);
    }
}
