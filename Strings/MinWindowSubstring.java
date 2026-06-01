//Leetcode Q.76
package Strings;
import java.util.*;

public class MinWindowSubstring{
    public static void main(String args[]){
        String s = "ADOBECODEBANC";
        String t = "ABC";

        HashMap<Character,Integer> freqMap = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch,0) + 1);
        }

        int uniqueCharCount = freqMap.size();
        int startIndex = -1;
        int windowStart = 0;
        int windowEnd = 0;
        int minLen = Integer.MAX_VALUE;
        int n = s.length();

        while(windowEnd < n){
            //Expension
            char ch = s.charAt(windowEnd);
            if(freqMap.containsKey(ch)){
                freqMap.put(ch, freqMap.get(ch)-1);
                if(freqMap.get(ch) == 0){
                    uniqueCharCount--;
                }
            }
            //shrinking 
            while(uniqueCharCount == 0){
                int len = windowEnd - windowStart + 1;
                if(len < minLen){
                    minLen = len;
                    startIndex = windowStart;
                }
                ch = s.charAt(windowStart);
                if(freqMap.containsKey(ch)){
                    freqMap.put(ch, freqMap.get(ch) + 1);
                    if(freqMap.get(ch) > 0){
                        uniqueCharCount++;
                    }
                }
                windowStart++;
            }
            windowEnd++;
        }
        if(startIndex == -1){
            System.out.println("");
            return;
        }
        System.out.println(s.substring(startIndex, startIndex+minLen));
    }
}