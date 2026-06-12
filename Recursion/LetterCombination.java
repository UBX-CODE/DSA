//Leetcode Q.17
package Recursion;
import java.util.*;

public class LetterCombination{
    public static void backtrack(int index, String digits, String current, List<String> result, String[] map){
        if(index == digits.length()){
            result.add(current);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for(int i=0; i<letters.length(); i++){
            backtrack(index + 1, digits, current + letters.charAt(i), result, map);
        }
    }    


    public static void main(String args[]){
        String digits = "2";

        List<String> result = new ArrayList<>();

        if(digits.length() == 0){
            System.out.println(result);
            return;
        }

        String[] map = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz",
        };

        backtrack(0, digits, "", result, map);

        System.out.println(result);
    }
}