//Leetcode Q.41
package Arrays;
import java.util.*;

public class FirstMissingPositive{
    public static void main(String args[]){
        int nums[] = {3,4,-1,1};

        for(int i=0; i<nums.length; i++){

            while(nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]){

                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1] = temp;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(nums.length+1);
    }
}