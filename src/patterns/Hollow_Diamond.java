package patterns;

public class Hollow_Diamond {
    public static void main(String[] args) {
        int range  = 6;
        for (int i = 1; i<=range; i++){
            for(int a = i; a<=range; a++){
                System.out.print("*");
            }
            for(int j = 1; j<=i*2-2;j++){
                System.out.print(" ");
            }
            for(int a = i; a<=range; a++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i<=range; i++){
            for(int a = 1; a<=i; a++){
                System.out.print("*");
            }
            for(int j = 2*i-2; j< 2*range-2;j++){
                System.out.print(" ");
            }
            for(int a = 1; a<=i; a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
