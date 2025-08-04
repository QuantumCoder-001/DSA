package array.Hashing;

import java.util.HashSet;
import java.util.Set;

public class Happy_Number {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        int i = 0;
        while(n != 1){
            int copy = n;
            int sum = 0;
            while(copy > 0){
                int num = copy % 10;
                sum += (int)Math.pow(num,2);
                copy /= 10;
            }
            n = sum;
            if (!set.contains(sum)) {
                set.add(sum);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
