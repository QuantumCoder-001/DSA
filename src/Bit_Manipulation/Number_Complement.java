package Bit_Manipulation;

public class Number_Complement {
    public int findComplement(int n) {
        int count = 0;
        int temp = n;
        while(temp != 0){
            count += 1;
            temp = temp >> 1;
        }
        for(int i = 0; i<count; i++){
            n = n ^ (1<<i);
        }
        return n;
    }
}
