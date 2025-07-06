package patterns;

public class Hollow_Right_Triangle {
    public static void main(String[] args) {
        int range = 10;
        for(int i = 1; i<=range; i++){
            for(int j = 1; j<=i;j++){
                if(j!=1 && j!=i && i!=range){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
