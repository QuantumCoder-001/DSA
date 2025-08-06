package Bit_Manipulation;

public class Single_Number_II {
    public int singleNumber(int[] nums) {
        int result = 0 ;
        for(int i = 0; i<32; i++){
            int count = 0;
            for(int num : nums){
                if((num & (1<<i)) != 0){
                    count++;
                }
            }
            if(count % 3 != 0){
                result = result | (1<<i);
            }
        }
        return result;
    }
}
