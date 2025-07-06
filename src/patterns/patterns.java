package patterns;

public class patterns {
    public static void main(String[] args) {
         for(int i=0;i<5;i++){                //*****
           for(int j=i;j<5;j++){              //****
                System.out.print("*");        //***
            }                                 //**
            System.out.println();             //*
        }
        for(int p=0;p<5;p++){
            for(int q=0;q<=p;q++) {            //*
                System.out.print("*");         //**
            }                                  //***
            System.out.println();              //****
        }                                      //*****

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){               //*****
                if(i>j){                        // ****
                    System.out.print(" ");      //  ***
                }                               //   **
                else{                           //    *
                System.out.print("*");}
            }
            System.out.println();
        }

        for (int p = 0; p < 5; p++) {
            for (int q = 4; q >= 0; q--) {     //    *
                if (q> p) {                    //   **
                    System.out.print(" ");     //  ***
                }                              // ****
                else {                         //*****
                    System.out.print("*");
                }
            }
                System.out.println();
        }
    }
}
