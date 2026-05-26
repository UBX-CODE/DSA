//Leetcode Q.134
package Arrays;
import java.util.*;

public class GasStation{
    public static void main(String args[]){
        int gas[] = {1,2,3,4,5};
        int cost[] = {3,4,5,1,2};

        int total = 0;
        int tank = 0;
        int start = 0;

        for(int i=0; i<gas.length; i++){
            int currGas = gas[i] - cost[i];

            total += currGas;
            tank += currGas;
            if(tank < 0){
                start = i+1;
                tank = 0;
            }
        }
        if(total < 0){
            System.out.println("-1");
            return ;
        }
        System.out.println(start);
    }
}