package patterns;

public class _8Star {
    public static void main(String[] args) {
        int range = 4;
        for (int i = 1; i<=range; i++){
            for(int j = 1; j<=range; j++){
                if(((i == 1) || (i == range)) && ((j != 1) && (j != range))){
                    System.out.print("*");
                }
                else{
                    if(((i!=1) && (i != range)) && ((j==1) || (j==range))){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        for(int a = 1; a<range; a++){
            for(int k = 1; k<=range; k++){
                if(((a == range-1)) && ((k != 1) && (k != range))){
                    System.out.print("*");
                }
                else{
                    if((a != range-1) && ((k==1) || (k==range))){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
