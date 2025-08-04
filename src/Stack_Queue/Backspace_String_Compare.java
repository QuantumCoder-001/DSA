package Stack_Queue;

public class Backspace_String_Compare {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!a.isEmpty()) a.deleteCharAt(a.length() - 1);
            }
            else {
                a.append(c);
            }
        }
        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (!b.isEmpty()) b.deleteCharAt(b.length() - 1);
            }
            else {
                b.append(c);
            }
        }
        return a.toString().contentEquals(b);
    }
}
