package array;

public class _121_Best_Time_to_Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices) {
        int profit = 0;

        int buy = prices[0];
        for(int i = 1; i < prices.length; i++){
            int sell = prices[i];
            if(buy > sell){
                buy = sell;
            }else if (sell - buy > profit){
                profit = sell - buy;
            }
        }
        return profit;
    }

    public static void main(String[] args){
        int[] nums1 = {7,1,5,3,6,4};
        int result = maxProfit(nums1);
        System.out.println(result);
    }

}
