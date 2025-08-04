package array.TwoPointers;

public class Backspace_String_Compare {
    public boolean checking(String s, String t){
        int i = s.length()-1;
        int j = t.length()-1;
        while (i >= 0 || j >= 0){
            i = getValidIndex(s, i);
            j = getValidIndex(t, j);
            if(i >= 0 && j >= 0){
                if(s.charAt(i) != t.charAt(j)){
                    return false;
                }
            }
            else if(i >= 0 || j >= 0){
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
    public int getValidIndex(String x, int index){
        int skip = 0;
        while(index >= 0){
            if(x.charAt(index) == '#'){
                index--;
                skip++;
            }
            else if(skip > 0){
                index--;
                skip--;
            }
            else{
                break;
            }
        }
        return index;
    }
}
