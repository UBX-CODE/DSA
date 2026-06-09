//Leetcode Q.78
package Recursion;
import java.util.*;

public class SubSets{
    public static void backtrack(int index, int[] nums,List<Integer> current, List<List<Integer>> result){

        if(index == nums.length){
            result.add(new ArrayList<>(current));
            return ;
        }
        current.add(nums[index]);

        backtrack(index + 1, nums, current, result);

        current.remove(current.size() - 1);

        backtrack(index + 1, nums, current, result);

    }
    public static void main(String args[]){
        int nums[] = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), result);
        System.out.println(result);
    }
}