package patterns;

class patternpractice {
    public static void main(String[] args) {
        for(int i=0;i<5;i+=1){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a=0;a<5;a++){
            for(int b=5-a;b>0;b--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int p=5;p>0;p--){
            for(int q=1;q<=5;q++){
                if(p>q){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for(int m=0;m<5;m++){
            for(int n=0;n<5;n++){
                if(m>n){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for(int w=0;w<5;w++){
            for(int x=0;x<=w;x++){
                if((w==x)||x==0||(w==4)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        for(int d=0;d<5;d++){
            for(int e=0;e<=5-d;e++){
                if((e==d)||e==0||(d==0)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


        for(int t=0;t<5;t++){
            for(int u=0;u<5;u++){
                if(u==0||t==4||u==4||t==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        for(int f=0;f<5;f++){
            for(int g=0;g<5;g++){
                if(f%2==g%2){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }


            }
            System.out.println();
        }
        for(int x1=5;x1>0;x1--){
            for(int x2=01;x2<=5;x2++){
                if(x1>x2){
                    System.out.print(" ");
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.println();
        }




    }
}
