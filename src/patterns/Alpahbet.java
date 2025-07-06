package patterns;

public class Alpahbet {
    public static void main(String[] args) {
        String[] a = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"};
        char c = 'A';
        int size = 5;
        for(int i = 0; i<size; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
        for(int i = 0; i<size; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(a[j]);
            }
            System.out.println();
        }
    }
}
