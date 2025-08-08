package recursion.Tree;

public class Tower_of_Hanoi {
    public static void moves(int disks, char A, char B, char C){
        if(disks == 0){
            return;
        }
        moves(disks-1, A, C, B);
        System.out.println("Moves Disk From :" + A + " to " + C);
        moves(disks-1, B, A, C);
    }
    public static void main(String[] args) {
        moves(2,'A', 'B', 'C');
    }
}
