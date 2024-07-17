public class BestTimetoBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        int sell=0;
        for(int i=0;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }
        sell=prices[i]-buy;
        profit=Math.max(profit,sell);
        }
       return profit;
    }
}
