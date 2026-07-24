//Leetcode Q.136
package Arrays;

public class SingleNumber {
    public static void main(String args[]){
         int nums[] = {1,2,1,3,2};
         int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        System.out.println(result) ;
    }    
}
