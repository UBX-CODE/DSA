package Arrays;
import java.util.*;

public class MaxSubarray {
    public static void main(String args[]){
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int CurrentSum = 0;
        int maxSum = nums[0];

        for(int i=0; i<nums.length; i++){
            CurrentSum +=nums[i];
            maxSum = Math.max(maxSum, CurrentSum);
            if(CurrentSum < 0){
                CurrentSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
