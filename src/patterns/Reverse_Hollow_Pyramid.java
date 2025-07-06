package patterns;

public class Reverse_Hollow_Pyramid {
    public static void main(String[] args) {
        int range = 5;
        for(int i = 0; i<range;i++){
            for(int j = 0; j<=i;j++){
                System.out.print(" ");
            }
            for(int k = 0; k<range*2-2*i-1;k++)
                if(k==0 || k == range*2-2*i-2 || i==0){
                    System.out.print("*");
                }
            else{
                System.out.print(" ");
                }
            System.out.println();
        }

    }
}
