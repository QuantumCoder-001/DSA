package recursion.String;

public class PrintName {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        if(n == 0){
            return;
        }
        System.out.println("Bilal");
        print(n - 1);
    }
}
