package recursion.String;

public class Hi_Replace_With_Hello {
    public static String hiWithHello(String s){

        if(s.length() <= 1){
            return s;
        }

        if(s.charAt(0) == 'H' && s.charAt(1) == 'i'){
            String res = hiWithHello(s.substring(2));
            return "Hello" + res;
        }
        else{
            String res = hiWithHello(s.substring(1));
            return s.charAt(0) + res;
        }
    }
    public static void main(String[] args) {
        String s = "Hi Bilal Hi Prince";
        String result = hiWithHello(s);
        System.out.println(result);

    }
}
