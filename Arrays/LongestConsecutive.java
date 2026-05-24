package Arrays;
import java.util.*;

public class LongestConsecutive {
    public static void main(String args[]){
        int nums[] = {200, 3, 100, 1, 2, 5, 4};
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int longest = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int current = num;
                int count = 1;

                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
        System.out.println(longest);
    }
}
