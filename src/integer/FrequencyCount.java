package integer;

import java.util.HashMap;
public class FrequencyCount {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int num = 722247;
        while(num>0){
            int digit = num%10;
            if(map.get(digit)==null){
                map.put(digit,1);
            }
            else{
                int count = map.get(digit);
                count++;
                map.put(digit,count);
            }
            num/=10;
        }
        System.out.println(map);
    }
}
