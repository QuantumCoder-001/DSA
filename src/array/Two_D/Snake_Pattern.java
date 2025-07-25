package array.Two_D;
import java.util.ArrayList;

public class Snake_Pattern {
    static ArrayList<Integer> snakePattern(int[][] matrix) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            if(i%2 == 0){
                for(int j = 0; j < n; j++){
                    list.add(matrix[i][j]);
                }
            }
            else{
                for(int j = n-1; j >= 0; j--){
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
}
