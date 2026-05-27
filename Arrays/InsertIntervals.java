//Leetcode Q.57
package Arrays;
import java.util.*;

public class InsertIntervals{
    public static void main(String args[]){
        int intervals[][] = {{1,3}, {6,9}};
        int newInterval[] = {2,5};

        List<int[]> result = new ArrayList<>();

        int i=0;

        //left side 
        while(i<intervals.length && intervals[i][1] < newInterval[0]){
            result.add(intervals[i]);

            i++;
        }

        //overlap
        while(i<intervals.length && intervals[i][0] <= newInterval[1]){
                newInterval[0] = Math.min(intervals[i][0] , newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1] , newInterval[1]);

                i++;
            }
            result.add(newInterval);

        //remaining
        while(i<intervals.length){
            result.add(intervals[i]);
            i++;
        }
        for(int arr[] : result){
            System.out.println(Arrays.toString(arr));
        }
    }
}
