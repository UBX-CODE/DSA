//Leetcode Q.442
package Arrays;
import java.util.*;

public class FindDuplicates{
    public static void main(String args[]){
        int nums[] = {4,3,2,7,8,2,3,1};
        
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i])-1;

            if(nums[index] < 0){
                result.add(Math.abs(nums[i]));
            }
            else{
                nums[index] = -nums[index];
            }
        }
        System.out.println(result);
    }
}