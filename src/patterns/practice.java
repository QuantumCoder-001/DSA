package patterns;

public class practice {
    public static void main(String[] args) {
        for(int a=1;a<6;a++){
            for(int b=1;b<=a;b++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int c=1;c<6;c++){
           for(int d=c;d<6;d++){
                System.out.print("*");
           }
            System.out.println();
        }
        for(int e=5;e>0;e--){
            for(int f=1;f<=5;f++) {
                if (e > f) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int g=1;g<6;g++){
            for(int h=1;h<6;h++){
                if(g>h){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=1;i<6;i++){
            for(int j=1;j<=i;j++){
                if(j==1||i==5||i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int k=5;k>0;k--){
            for(int l=1;l<=5;l++){
                if(k>l){
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }}
            System.out.println();
        }
        for(int m=1;m<6;m++){
            for(int n=1;n<6;n++){
                if(m>n){
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for(int o=5;o>0;o--){
            for(int p=1;p<=5;p+=1){
                if(o==p||p==5||o==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
