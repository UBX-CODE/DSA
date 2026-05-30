//Leetcode Q.567
package Strings;
import java.util.*;

public class PermutationInString{
    public static void main(String args[]){
        String s1 = "ab";
        String s2 = "eidbaooo";

        if(s1.length() > s2.length()){
            System.out.println("False");
            return;
        }
        int s1Count[] = new int[26];
        int windowCount[] = new int[26];

        for(int i=0; i<s1.length(); i++){
            s1Count[s1.charAt(i)-'a']++;
            windowCount[s2.charAt(i)-'a']++;

        }
        if(Arrays.equals(s1Count, windowCount)){
            System.out.println("true");
            return;
        }
    
        for(int i=s1.length(); i<s2.length(); i++){
            windowCount[s2.charAt(i)-'a']++;

            windowCount[s2.charAt(i-s1.length())-'a']--;
            if(Arrays.equals(s1Count,windowCount)){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}