package array;

    // Approach 1 Brute Force
//    public static int getBestTime(int [] prices){
//        int maxProfit = 0;
//        for(int i = 0; i<prices.length; i++){
//            for (int j= i+1; j<prices.length; j++){
//                if(prices[j]>prices[i]){
//                int currentProfit = prices[j] - prices[i];
//                maxProfit = Math.max(maxProfit,currentProfit);
//                }
//            }
//        }
//        return maxProfit;
//    }
    public class BestTimeToBuy_SellStock {

        public static void main(String[] args) {
            int[] prices = {7, 2, 3, 5, 10};
            int x = getBestTime(prices);
            System.out.println(x);
        }

//Approach 2
    public static int getBestTime(int[] prices) {

        int lowestPrice = prices[0];
        int maxProfit = 0;
        for (int i=1; i<prices.length; i++){
            if(prices[i]>lowestPrice){
                int currentProfit = prices[i] - lowestPrice;
                maxProfit = Math.max(currentProfit, maxProfit);
            }
            lowestPrice = Math.min(lowestPrice,prices[i]);
        }
        return maxProfit;
    }

}