//Leetcode Q.901
package StackQueue;
import java.util.*;

public class StockSpan{
    Stack<int[]> stack;
    public StockSpan(){
        stack = new Stack<>();
    }
    public int next(int price){
        int span = 1;
        while(!stack.isEmpty() && stack.peek()[0] <= price){
            span += stack.peek()[1];
            stack.pop();
        }
        stack.push(new int[]{price, span});
        return span;
    }
    public static void main(String[] args) {

        StockSpan spanner = new StockSpan();

        System.out.println(spanner.next(100));
        System.out.println(spanner.next(80));
        System.out.println(spanner.next(60));
        System.out.println(spanner.next(70));
        System.out.println(spanner.next(60));
        System.out.println(spanner.next(75));
        System.out.println(spanner.next(85));

    }
}