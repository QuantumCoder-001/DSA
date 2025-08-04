package Stack_Queue;

public class Remove_All_Adjacent_Duplicates_In_String {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.charAt(stack.length()-1) == c){
                stack.deleteCharAt(stack.length()-1);
            }
            else{
                stack.append(c);
            }
        }
        return stack.toString();
    }
}
