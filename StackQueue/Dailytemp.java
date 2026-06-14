//Leetcode Q.739
package StackQueue;
import java.util.*;

public class DailyTemp{
    public static void main(String args[]){
        int[] temp = {73,74,75,71,60,72,76,73};
        int n = temp.length;

        int result[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=n-1 ;i>0; i--){
            while(!stack.isEmpty() && temp[stack.peek()] < temp[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(result));
    }
}