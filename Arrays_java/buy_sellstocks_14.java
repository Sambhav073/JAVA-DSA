public class buy_sellstocks_14 {
    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        buysellstocks(prices);
    }

    public static void buysellstocks(int prices[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int x = 0; x < prices.length; x++) {
            if (buyprice < prices[x]) {
                int profit = prices[x] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = prices[x];
            }
        }
        System.out.println(maxprofit);
    }

}
