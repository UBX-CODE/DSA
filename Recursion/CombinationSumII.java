//Leetcode Q.40
package Recursion;
import java.util.*;

public class CombinationSumII{
    public static void backtrack(int index ,int[] candidates, int target, List<Integer> current, List<List<Integer>> result){

        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(target < 0){
            return;
        }
        for(int i=index; i<candidates.length; i++){
            if(i > index && candidates[i] == candidates[i-1]){
                continue;
            }
            current.add(candidates[i]);
            backtrack(i + 1, candidates, target - candidates[i], current, result);

            current.remove(current.size() - 1);

        }
    }

    public static void main (String args[]){
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;

        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();

        backtrack(0,candidates, target, new ArrayList<>(), result);

        System.out.println(result);
    }
}