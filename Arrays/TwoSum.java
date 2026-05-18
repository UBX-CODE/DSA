package Arrays;
import java.util.*;

public class TwoSum {
    public static void main(String args[]){
        int nums[] = {2,7,11,15};
        int target = 9;

        //  for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             System.out.print(i+" "+j);
        //         }
        //     }
        //  }

        //Hashmap
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int needed = target - nums[i];

            if(map.containsKey(needed)){
                System.out.println("[" + map.get(needed) + "," + i + "]");
                return;
            }
            map.put(nums[i],i);
        }


    }
}
