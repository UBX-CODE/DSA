//Leetcode Q.20
package Strings;
import java.util.*;

public class ValidParentheses{
    public static void main(String args[]){
        String s = "(){";

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '[' || ch == '(' || ch == '{' ){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    System.out.println(false);
                    return;
                }
                char top = stack.pop();
                if(ch == ')' && top != '(' || ch == ']' && top != '[' || ch == '}' && top != '{'){
                    System.out.println(false);
                    return;
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}