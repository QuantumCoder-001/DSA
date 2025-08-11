package backtracking;

public class Word_Search {
    static int[][] directions = {{1,0}, {0,1}, {0,-1}, {-1,0}};
    public static boolean exists(char [][] board, String word){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(isFound(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean isFound(char [][] board, String word, int row, int col, int index){
        if(index == word.length()){
            return true;
        }
        if(row >= board.length || col >= board[0].length || row < 0 || col < 0 || board[row][col] != word.charAt(index)){
            return false;
        }
        char temp = board[row][col];
        board[row][col] = '#';
        for(int k = 0; k<4; k++){
            int newRow = directions[k][0];
            int newCol = directions[k][1];
            boolean isMatch = isFound(board, word, row+newRow, col+newCol, index+1);
            if(isMatch){
                return true;
            }
        }
        board[row][col] = temp;
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(exists(board,"ASADE"));
    }
}
