package Arrays;
import java.util.*;

public class NextPermutation {
    public static void main(String args[]){
        int nums[] = {1,2,3};
        int n = nums.length;
        int i = n-2;

        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }

        if(i>=0){
            int j = n-1;

            while(nums[j] <= nums[i]){
                j--;
            }
                //swap
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
        }

        int left = i+1;
        int right = n-1;

        while(left < right){
            //swap
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
