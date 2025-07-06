package integer;

import java.util.Scanner;
public class GreatestNum {

    public static void main(String[]a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int x = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int y = sc.nextInt();
        System.out.println("Enter the 3rd number");
        int z = sc.nextInt();

        if(x>y){
            if (x>z) {
                System.out.println("x is greatest: " + x);
            }
            else{
                System.out.println("z is greatest: "+z);
            }
        }
        if(y>z) {
            System.out.println("y is greatest: " + y);
        }
        else{
                System.out.println("z is greatest: " + z);
            }
        sc.close();
        }


    }




