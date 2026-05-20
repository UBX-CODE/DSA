package Arrays;
import java.util.*;

class RotateMatrix {
    public static void main(String args[]) {
        int nums[][] = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        //transpose
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                //swap
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
        //reverse each row
        for(int i = 0; i<nums.length; i++){
            int left = 0;
            int right = nums.length-1;
            while(left < right){
                //swap
                int temp = nums[i][left];
                nums[i][left] = nums[i][right];
                nums[i][right] = temp;

                left++;
                right--;
            }
        }
        System.out.println(Arrays.deepToString(nums));
    }
}