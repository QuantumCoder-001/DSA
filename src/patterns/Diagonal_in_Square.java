package patterns;

public class Diagonal_in_Square {
    public static void main(String[] args) {
        int range = 11;
        for(int i = 1; i<=range; i++){
            for(int j = 1; j<=range; j++){
                if(i==1 || i==range ||j==1 || j==range || i==j || i==range-j+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
