//Leetcode Q.242
package Strings;
import java.util.*;

public class ValidAnagram{
    public static void main(String args[]){
        String s = "anagram";
        String t = "nagaram";

        if(s.length() != t.length()){
            System.out.println("False");
            return;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);

            if(!map.containsKey(ch)){
                System.out.println("False");
                return;
            }
            map.put(ch, map.get(ch)-1);

            if(map.get(ch) == 0){
                map.remove(ch);;
            }
        }
        System.out.println(map.isEmpty());
    }
}