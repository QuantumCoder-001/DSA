package backtracking;

public class BackTrack2 {
    static void fillarray(int arr[],int val, int index){
        if(index==arr.length){
            return;
        }
        arr[index]=val;
        fillarray(arr,val+1,index+1);
        if(arr[index]==4){
        arr[index]=val*val;}

    }
    public static void main(String[] args) {
        int arr[]= new int[5];
        fillarray(arr,1,0);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
