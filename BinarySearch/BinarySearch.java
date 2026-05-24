package BinarySearch;
import java.util.*;

public class BinarySearch {
    public static void main (String args[]){
        int nums[] = {-1,0,3,5,7,9};
        int target = 9;
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = left+right/2;
            if(nums[i] > nums[mid]){
                right = mid - 1;
            }else if(nums[i] < nums[mid]){
                left = mid+1;
            }else nums[i] == mid
        }
    }
}
