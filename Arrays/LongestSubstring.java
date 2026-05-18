//sliding window
package Arrays;
import java.util.*;

public class LongestSubstring {
    public static void main(String args[]){
        String s = "abcabcdb";
        
        HashSet<Character> map = new HashSet<>();
        int right = 0;
        int left = 0;
        int maxLength = 0;

        while(right < s.length()){

            char ch = s.charAt(right);

            if(!map.contains(ch)){

                map.add(ch);
                maxLength = Math.max(maxLength, right-left+1);
                right++;
            }else{
                map.remove(s.charAt(left));
                left++;
            }
        }
        System.out.println(maxLength);

    }
}
