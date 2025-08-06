package array.Warmup;

public class Max_Consecutive_Characters {
    public static void main(String[] args) {
        String s = "leeeetcode";
        int count = 1, max = 1;
        char[] ch = s.toCharArray();
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] == ch[i - 1]) {
                count++;
                max = Math.max(count, max);
            } else {
                count = 1;
            }
        }
        System.out.println(max);
    }
}
