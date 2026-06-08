package Recursion;
import java.util.*;

public class SortStack{
    public static void SortedInsert(Stack<Integer> stack, int value){
       if(stack.isEmpty() || stack.peek() <= value){
        stack.push(value);
        return;
       } 

       int top = stack.pop();
       SortedInsert(stack, value);
       stack.push(top);
    }
    public static void SortStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        SortStack(stack);
        SortedInsert(stack, top);

    }
    public static void main(String args[]){

        Stack <Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(4);
        stack.push(2);

        System.out.println("Before : " + stack);
        SortStack(stack);
        System.out.println("After : " + stack);
    }
}                                            