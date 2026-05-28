//Leetcode Q.125
package Strings;
import java.util.*;

public class ValidPalindrome{
    public static void main(String args[]){
        String s = "A man, a plan, a canal: panama";

        int left = 0;
        int right = s.length()-1;

        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                System.out.println("False");
                return;
            }
            left++;
            right--;
        }
        System.out.println("true");
    }
}