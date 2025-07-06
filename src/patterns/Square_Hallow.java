package patterns;

public class Square_Hallow {
    public static void main(String[] args) {
        int range = 5;
        for(int i = 1; i<=range; i++){
            for(int j = 1; j<=range; j++){
                if(i==1 || i==range ||j==1 || j==range){
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
