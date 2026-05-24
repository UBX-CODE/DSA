package Arrays;
import java.util.*;

public class SlidingWindowMaximum{
    public static void main(String args[]){

        Deque<Integer> dq = new LinkedList<>();

        int result[] = new int[nums.length-k+1];

        int index = 0;

        for(int i=0; i<nums.length; i++){

            while(!dq.isEmpty() &&
                  dq.peekFirst() <= i-k){

                dq.pollFirst();
            }

            while(!dq.isEmpty() &&
                  nums[dq.peekLast()] < nums[i]){

                dq.pollLast();
            }

            dq.offerLast(i);

            if(i >= k-1){

                result[index++] =
                    nums[dq.peekFirst()];
            }
        }

        return result;
    }
}