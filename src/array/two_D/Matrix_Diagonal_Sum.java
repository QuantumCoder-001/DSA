package array.two_D;

public class Matrix_Diagonal_Sum {
     public int sum(int[][] mat){
         int n = mat.length;
         int sum = 0;
          for(int i = 0; i<n; i++){
              //Left Diagonal
              sum += mat[i][i];
              //Right Diagonal
              sum += mat[i][n-i-1];
          }
          if(n%2 != 0){
              sum -= mat[n/2][n/2];
          }
          return sum;
     }
}
