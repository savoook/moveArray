package bestTimeToBuyAndSellStock;

/*prices = [7,1,5,3,6,4]*/
class Solution {
    public int maxProfit(int[] prices) {
        int pointer = prices[0];
        int min = pointer;
        int max = pointer;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                max = prices[i];
            } else if (prices[i] > max) {
                max = prices[i];
            }
            profit = Math.max(profit, max - min);
        }
        return max - min;
    }
}
