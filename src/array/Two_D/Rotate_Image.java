package array.Two_D;

public class Rotate_Image {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //Transpose
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Reverse
        for(int i = 0; i < n; i++){
            int right = n-1;
            int left = 0;
            while(left<right){
                int temp  = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
