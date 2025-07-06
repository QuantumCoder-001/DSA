package integer;

public class HCF {
    public static void main(String[] args) {
        int x = 24;
        int y = 21;
        int max = 1;
        int i = 1;
        while(i<=(int)Math.min(x,y)/2){
            if(x%i==0 && y%i==0){
                max=i;
            }
            i++;
        }
        System.out.println(max);

        while(x!=y){
            if(x>y){
                x-=y;
            }
            else{
                y-=x;
            }
        }
        System.out.println(y);
    }
}
