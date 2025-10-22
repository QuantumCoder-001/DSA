package backtracking;

public class BackTrack {
    static void getAToZ(String result, int depth){
        if(depth==0){
            System.out.println(result);
            return;
        }
        for(char c='A';c<='Z';c++){
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            getAToZ(result + c,depth-1);
        }}
    }
    public static void main(String[] args) {
        getAToZ("",2);
    }
}
