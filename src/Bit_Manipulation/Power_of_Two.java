package Bit_Manipulation;

public class Power_of_Two {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n & (n-1)) == 0;
    }
}
