package dp;

public class leetcode300 {
        public int lengthOfLIS(int[] nums) {
            // dp tabulation
            int[] dp = new int[nums.length];
            int finalmax = 0;
            for (int i = 0; i < nums.length; i++) {
                int max = 0;
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]) {
                        if(max<dp[j]){
                        max = dp[j];}
                    }
                }
                dp[i] = max + 1;
                if(dp[i]>=finalmax){
                    finalmax=dp[i];
                }

            }
            return finalmax;
        }
}
class a{
    public static void main(String[] args) {
        int[] arr = new int[8];
        arr[0]=0;
        arr[1]=1;
        arr[2]=0;
        arr[3]=2;
        arr[4]=1;
        arr[5]=3;
        arr[6] =101;
        arr[7]=18;
        leetcode300 obj = new leetcode300();
        int res =obj.lengthOfLIS(arr);
        System.out.println(res);
    }

}
