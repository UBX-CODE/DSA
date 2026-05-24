package Arrays;
import java.util.*;

public class MaximumProductSubarray{
    public static void main(String args[]){

        int num[] = {-2,3,-4};
        int currentMax  = num[0];
        int currentMin  = num[0];
        int result = num[0];

        for(int i=1; i<num.length; i++){

            if(num[i] < 0){
                int temp = currentMax ;
                currentMax  = currentMin ;
                currentMin  = temp;
            }

            currentMax  = Math.max(num[i], currentMax * num[i]);

            currentMin  = Math.min(num[i], currentMin * num[i]);

            result = Math.max(result, currentMax);
        }
        System.out.println(result);
    }
}