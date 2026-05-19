package Arrays;
import java.util.*;

public class SortColor {
    public static void main(String args[]){
        int nums[] = {1,2,0,2,1,0};
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){

            if(nums[mid] == 0){
                //swap
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;
            }
            else if(nums[mid] == 2){
                //swap
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
            else{
                mid++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
