package integer;

import java.util.Scanner;
public class inputnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three Numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if((x+y>z)&&(x+z>y)&&(y+z>x)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
