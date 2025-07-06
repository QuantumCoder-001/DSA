package integer;

public class GreaterNum_InFour {
    public static void main(String[] args) {
        int a = 10;
        int b = 200;
        int c = 300;
        int d = 3000;
        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println("A is big");
                }
                else{
                    System.out.println("d is great");
                }
            }
            else if(c>d){
                System.out.println("c is great");
            }
            else{
                System.out.println("d id great");
            }
        }
        else if(b>c){
            if(b>d){
                System.out.println("b is great");
            }
            else{
                System.out.println(" d is great");
            }
        }
        else if(c>d){
            System.out.println("c is great");
        }
        else{
            System.out.println("d id great");
        }
    }
}
