package integer;

public class Armstrong_Num {
    public static void main(String[] args) {
        int x = 374;
        int copy = x;

        int i = 0;
        while (copy>0){
            copy/=10;
            i++;
        }
        copy = x;
        int last = 0;
        int num = 0;
        while(copy>0){
            last  = copy%10;
            last = (int)Math.pow(last,i);
            num +=last;
            copy/=10;
        }
        System.out.println(num==x?"Armstrong Number":"Not a Armstrong Num");
    }
}
