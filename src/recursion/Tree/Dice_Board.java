package recursion.Tree;

public class Dice_Board {
    public static void allWays(int currentValue, int endValue, String result){
        if(currentValue == endValue){
            System.out.print(result+" , ");
            return;
        }
        if(currentValue > endValue){
            return;
        }
        for(int dice = 1; dice<=6; dice++){
            allWays(currentValue+dice, endValue, result+dice);
        }
    }
    public static void main(String[] args) {
        allWays(0,5,"");
    }
}
