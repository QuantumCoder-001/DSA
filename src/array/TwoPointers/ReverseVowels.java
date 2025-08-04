package array.TwoPointers;

public class ReverseVowels {
    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    static void swap(char[] a, int r, int l){
        char temp = a[r];
        a[r] = a[l];
        a[l] = temp;
    }
    static String revVow(String s){
        int right= s.length()-1;
        int left = 0;
        char[] a = s.toCharArray();
        while(right>=left){
            if((isVowel(a[right])) && (isVowel(a[left]))){
                swap(a,right, left);
                right--;
                left++;
            }
            else if(isVowel(a[right])){
                left++;
            }
            else if(isVowel(a[left])){
                right--;
            }
            else{
                left++;
                right--;
            }
        }
        s = String.valueOf(a);
        return s;
    }
    public static void main(String[] args) {
        String s = "IceCreAm";
        String d = revVow(s);
        System.out.print(d);
    }
}
