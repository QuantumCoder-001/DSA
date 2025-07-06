package integer;

public class LCM {
    public static void main(String[] args) {
        int a = 12;
        int b = 3;
        int acopy = a;
        int bcopy = b;
        while(a!=b)
            if(a>b){
                a-=b;
            }
        else{
            b-=a;
        }
        System.out.println("LCM: "+(acopy*bcopy)/b);
    }
}
