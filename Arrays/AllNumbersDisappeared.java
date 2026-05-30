package Arrays;
import java.util.*;

public class AllNumbersDisappeared{
    public static void main(String args[]){
        int nums[] = {4,3,2,8,8,2,3,1};
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            int index = Math.abs(nums[i]) - 1;

            if(nums[index] > 0){
                nums[index] = -nums[index];
            }
        }
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                result.add(i+1);
            }
        }
        System.out.println(result);
    }
}