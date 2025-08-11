package backtracking;

import java.util.ArrayList;
import java.util.List;

public class letter_Combination_of_Phone_Number {
    static String[] keys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static List<String> letterCombination(String digits){
        return helper(digits);
    }
    static List<String> helper(String digits) {
        if (digits.isEmpty()) {
            return List.of(""); // shorter way to create single empty string list
        }
        char first = digits.charAt(0);
        String letters = keys[first - '0'];

        List<String> suffixes = helper(digits.substring(1)); // call once
        List<String> result = new ArrayList<>();
        for (char c : letters.toCharArray()) {
            for (String suffix : suffixes) {
                result.add(c + suffix);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> result = letterCombination("23");
        System.out.println(result);
    }
}
