package InputMethods;

import java.io.*;

public class SystemIn  {
    public static void main(String[] args) throws IOException {
//        int x = System.in.read();  //only single char
//        System.out.println(x);// returns ascii value (0=48)
//        byte [] ch = System.in.readAllBytes(); // infinite read
          BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the name ");
          String name = bf.readLine();
          System.out.println("Enter the id");
          int id = Integer.parseInt(bf.readLine());
          System.out.println("Name: "+name);
          System.out.println("ID: "+id);
          bf.close();

    }
}
