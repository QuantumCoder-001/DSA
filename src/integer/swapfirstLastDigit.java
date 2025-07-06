package integer;
class swapfirstLastDigit{
    public static void main(String[] args) {
        int x = 12222223;
        int sum = 0;
        int copy  = x;
        int last = copy%10;
        int i = -1;
        while(x>0){
            x/=10;
            i++;
        }
        int first = copy/(int)Math.pow(10,i);
        copy/=10;
        int mid = copy%(int)Math.pow(10,i-1);

        sum = last * (int) Math.pow(10,i) +mid*(int)Math.pow(10,1) + first;
        System.out.println(sum);

        // Short Cut
         int y = 1223;
         int rev = 0;
         while(y>0){
             int lastDigit = y%10;
             rev = rev * 10 + lastDigit;
             y/=10;
         }
         System.out.println(rev);




    }
}
