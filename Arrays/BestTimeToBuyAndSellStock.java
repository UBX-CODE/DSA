// one pass / two pointer thinking
package Arrays;
import java.util.*;

public class BestTimeToBuyAndSellStock {
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};

        int minprice = prices[0];
        int maxprofit = 0;

        for(int i=1; i<prices.length; i++){

            if(prices[i] < minprice){
                minprice = prices[i];
            }
            // calculate profit if sold today
            int profit  = prices[i] - minprice;

            //update maximum profit
            if(profit > maxprofit){
                maxprofit = profit;
            }
        }
        System.out.println(maxprofit);
    }
}
