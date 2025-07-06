package String;

import java.util.Scanner;
class Abc {
    public String convert(String sentence) {
        StringBuilder finalName = new StringBuilder();
        String[] list = sentence.split(" ");
        for(String name: list ){
            if(name.length()>2){
            char singleChar = name.charAt(0);
            String var = Character.toUpperCase(singleChar) + name.substring(1).toLowerCase();
            finalName.append(var);
            }
            else{
                name = name.toLowerCase();
                finalName.append(name);
            }
            finalName.append(" ");
        }
        return finalName.toString().trim();
    }
}
public class StringtoCamelCase {
    public static void main(String[] args) {
        Abc d = new Abc();
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String finalStr = d.convert(sentence);
        System.out.println(finalStr);
    }
}

