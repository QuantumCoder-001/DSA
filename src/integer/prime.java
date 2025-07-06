package integer;

import java.util.Scanner;

class prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        int num = sc.nextInt();
        for(int i=2; i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println("Not Prime Number");
                return;
            }
        }
        System.out.println("Prime");

    }
}
