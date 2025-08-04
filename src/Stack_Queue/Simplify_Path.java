package Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Simplify_Path {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        Deque<String> stack = new ArrayDeque<>();

        for (String p : paths) {
            if (p.equals(".") || p.isEmpty()) {
                continue;
            }
            else if (p.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else {
                stack.push(p);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }
        return result.isEmpty() ? "/" : result.toString();
    }
}
