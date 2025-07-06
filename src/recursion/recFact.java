package recursion;

public class recFact {
    static void fact(int n,int result){
        if(n==1){
            System.out.println(result);
            return;
        }
        fact(n-1,n*result);


    }

    public static void main(String[] args) {
        fact(3,1);
    }
}
