package integer;

import java.util.Scanner;

public class inputnumlimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit for each Number(1-9): ");
        int y = sc.nextInt();
        System.out.println("Enter the Number: ");
        int x = sc.nextInt();
        int sum = 0;

        while(x>10){
            sum=x%10;
            if(sum>y){
                System.out.println("Number Outside limit");
                break;}
            x/=10;
        }
        if(sum<5){
            System.out.println("Accepted");}
    }
}