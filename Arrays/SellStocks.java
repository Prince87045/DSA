/*
 * profit=Selling price-buying price
 */

public class SellStocks {
    public static int buyAndSellStocks(int prices[]){
        int maxProfit=0;
        int buyPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>buyPrice){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,10,4};
        //storing the function store value in variable
        int maxProfit=buyAndSellStocks(prices);
        System.out.println(maxProfit);

    }
}
