package apnaCollege.arrays;

public class StockBuy_and_Sell {
    static int profit(int [] prices, int n){
        int Profit = 0;
        for(int i=1; i<n; i++){
            if(prices[i] > prices[i-1]){
                Profit += prices[i]-prices[i-1];
            }
        }
        return Profit;
    }
    public static void main(String[] args) {
        int prices [] = {7,1,5,3,6,4};
        int n = prices.length;
        int ans = profit(prices, n);
        System.out.println(ans);
    }
}
