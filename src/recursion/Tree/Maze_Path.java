package recursion.Tree;

public class Maze_Path {
    public static void allPaths(int col, int row, int endCol, int endRow, String result){
        if(col == endCol && row == endRow){
            System.out.println(result);
            return;
        }
        if(col > endCol || row > endRow){
            return;
        }
        allPaths(col+1, row, endCol, endRow, result + "H");
        allPaths(col, row+1, endCol, endRow, result + "V");
    }
    public static void main(String[] args) {
        allPaths(0,0,2,2,"");
    }
}
