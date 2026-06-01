//Leetcode Q.443
package Strings;
import java.util.*;

public class StringCompression{
    public static void main(String args[]){
        char chars[] = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int read = 0;
        int write = 0;

        while(read < chars.length){
            char current = chars[read];
            int count = 0;

            while(read < chars.length && chars[read] == current){
                read++;
                count++;
            }
            chars[write] = current;
            write++;

            if(count > 1){
                for(char c : String.valueOf(count).toCharArray()){
                    chars[write] = c;
                    write++;
                }
            }
        }
        System.out.println(write);
    }
}