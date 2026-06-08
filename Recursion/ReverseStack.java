package Recursion;
import java.util.*;

public class ReverseStack{
    public static void insertAtBottom(Stack<Integer> stack, int value){
       if(stack.isEmpty()){
        stack.push(value);
        return;
       } 

       int top = stack.pop();
       insertAtBottom(stack, value);
       stack.push(top);
    }
    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        reverse(stack);
        insertAtBottom(stack, top);

    }
    public static void main(String args[]){

        Stack <Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Before : " + stack);
        reverse(stack);
        System.out.println("After : " + stack);
    }
}