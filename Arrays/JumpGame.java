// Leetcode Q.55
package Arrays;
import java.util.*;

public class JumpGame{
    public static void main(String args[]){
        int nums[] = {2,3,1,1,4};
        int farthest = 0;

        for(int i=0; i<nums.length; i++){
            if(i > farthest){
                System.out.println("false");
                return;
            }

            farthest = Math.max(farthest, i + nums[i]);
        }
        System.out.println("true");
    }
}