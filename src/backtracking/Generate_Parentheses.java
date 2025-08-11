package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(0, 0, "", result, n);
        return result;
    }
    static void helper(int opening, int closing, String output, List<String> result, int n){
        if(opening == n && closing == n){
            result.add(output);
            return;
        }
        if(opening < n){
            helper(opening + 1, closing, output + "(", result, n);
        }
        if(closing < opening){
            helper(opening, closing + 1, output + ")", result, n);
        }
    }

    public static void main(String[] args) {
        List<String> res = generateParenthesis(3);
        System.out.println(res);
    }
}
