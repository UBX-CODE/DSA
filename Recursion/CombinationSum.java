//Leetcode Q.39
package Recursion;
import java.util.*;

public class CombinationSum{
    public static void backtrack(int index ,int[] candidates, int target, List<Integer> current, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(target < 0 || index == candidates.length){
            return;
        }
        //take current element
        current.add(candidates[index]);

        backtrack(index, candidates, target - candidates[index], current, result);

        current.remove(current.size() - 1);
        //don't take current element

        backtrack(index + 1, candidates, target, current, result);
    }

    public static void main (String args[]){
        int[] candidates = {2,3,6,7};
        int target = 7;

        List<List<Integer>> result = new ArrayList<>();

        backtrack(0,candidates, target, new ArrayList<>(), result);

        System.out.println(result);
    }
}