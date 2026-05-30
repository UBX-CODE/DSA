//Leetcode Q.438
package Strings;
import java.util.*;

public class FindAllAnagramsInAString{
    public static void main(String args[]){
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> result = new ArrayList<>();

        if(p.length() > s.length()){
            System.out.println("false");
            return;
        }

        int pCount[] = new int[26];
        int windowCount[] = new int[26];

        for(int i=0; i<p.length(); i++){
            pCount[p.charAt(i) - 'a']++;
            windowCount[s.charAt(i) - 'a']++;
        }
        if(Arrays.equals(pCount,windowCount)){
            result.add(0);
        }
        for(int i=p.length(); i<s.length(); i++){
            windowCount[s.charAt(i) - 'a']++;

            windowCount[s.charAt(i-p.length()) - 'a']--;
            
            if(Arrays.equals(pCount,windowCount)){
                result.add(i-p.length()+1);
            }
        }
        System.out.println(result);
    }
}