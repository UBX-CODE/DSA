//Two Pointer
package Arrays;
import java.util.*;
public class ValidPalindrome {
    public static void main(String args[]) {

        String s = "A man, a plan, a canal: Panama";

        int left = 0;
        int right = s.length()-1;

        while(left < right) {

            // Skip non-alphanumeric from left
            while(left < right && 
                  !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric from right
            while(left < right && 
                  !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Convert both to lowercase
            char l = Character.toLowerCase(s.charAt(left));
            char r = Character.toLowerCase(s.charAt(right));

            // Compare
            if(l != r) {
                System.out.println("False");
                return;
            }

            left++;
            right--;
        }

        System.out.println("True");
    }
}