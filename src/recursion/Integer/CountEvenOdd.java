package recursion.Integer;

public class CountEvenOdd {
    public static void main(String[] args) {
        count(11,0,0);
        int[] res = countint(11);
        System.out.println("even:"+res[0]+" odd:"+res[1]);
    }
    static void count(int range, int even, int odd){
        if(range == 0){
            System.out.println("even:"+even+" odd:"+odd);
            return;
        }
        if(range%2 == 0){
            count(range-1,even+=1,odd);
        }
        else {
            count(range - 1, even, odd+=1);
        }
    }
    static int[] countint(int range){
        if(range == 0){
            return new int[2];
        }
        int[] result = countint(range-1);
        if(range % 2 == 0){
            result[0] +=1;
        }
        else{
            result[1] +=1;
        }
        return result;
    }
}
