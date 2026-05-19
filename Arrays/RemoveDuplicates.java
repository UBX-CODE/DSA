package Arrays;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String args[]) {

        int nums[] = {1,2,2,2,3};

        int j = 0; // slow pointer

        for(int i=1; i<nums.length; i++) {

            // New unique element found
            if(nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        int k = j + 1;

        System.out.println("Unique count: " + k);

        // Print only valid unique elements
        for(int i=0; i<k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
