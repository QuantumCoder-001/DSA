package patterns;

public class Empty_Pyramid {
    public static void main(String[] args) {
        int range = 8;
        for(int i = 1; i<=range; i++){
            for(int j=1; j<=range + i-1; j++){
                if(j<range-i){
                    System.out.print(" ");
                }
                else{
                    if(i==range || j==range+i-1 || j==range-i+1){
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
