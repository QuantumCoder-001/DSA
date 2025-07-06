package integer;

public class intrest {
    public static void main(String[]args) {
        int P =10000;
        int R= 5;
        int T = 2;
        double i = P*(Math.pow((1+R/100.0),T))-P;
        System.out.println(i+R);

    }}
