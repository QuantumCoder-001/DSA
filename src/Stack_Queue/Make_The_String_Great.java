package Stack_Queue;

public class Make_The_String_Great {
    public String makeGood(String s) {
        StringBuilder stack = new StringBuilder();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && Character.toLowerCase(stack.charAt(stack.length() - 1)) == Character.toLowerCase(c) && stack.charAt(stack.length() - 1) != c ){
                stack.deleteCharAt(stack.length() - 1);
            }
            else{
                stack.append(c);
            }
        }
        return stack.toString();
    }
}
