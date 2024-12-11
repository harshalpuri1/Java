public class BuySell_Stocks {
    public static int maxProfit(int[] prices){

        int maxprof = 0;
        int buy = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if (buy < prices[i]){
                int profit = prices[i] -buy;
                maxprof = Math.max(profit, maxprof);
            }else{
                buy= prices[i];
            }
        }
        return maxprof;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int a = maxProfit(prices);
        System.out.println(a);
    }
}
