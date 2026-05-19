package Arrays;
import java.util.*;

public class MajorityElement {
    public static void main(String args[]){
        int nums[] = {3,2,3};
        int candidate = 0;
        int count = 0;

         for(int i=0 ; i<nums.length; i++){

            if(candidate == 0){
                candidate = nums[i];
            }
            if(candidate == nums[i]){
                count++;
            }else{
                count--;
            }

         }
         System.out.println(candidate);
    }
}
