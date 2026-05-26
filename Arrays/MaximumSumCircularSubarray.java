//Leetcode Q.918
package Arrays;
import java.util.*;

public class MaximumSumCircularSubarray{
    public static void main(String args[]){
        int nums[] = {5,-3,5};
        int total = 0;

        int currMax = 0;
        int maxSum = nums[0];

        int currMin = 0;
        int minSum = nums[0];

        for(int num : nums){
            currMax = Math.max(num, currMax+num);

            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(num, currMin+num);

            minSum = Math.min(minSum, currMin);

            total += num;
        }
        if(maxSum < 0){
            System.out.println(maxSum);
            return;
        }
        System.out.println(Math.max(maxSum, total - minSum));
    }
}