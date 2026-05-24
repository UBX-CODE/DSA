package Arrays;
import java.util.*;

public class ContainerWithMostWater {
    public static void main(String args[]){
        int height[] = {1,8,6,2,5,4,8,3,7};
        int left = 0;
        int right = height.length-1;
        int Maxarea = 0;

        while( left < right){
            int area = (right - left) * Math.min(height[left], height[right]);

            Maxarea = Math.max(Maxarea, area);
            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }
        }
        System.out.println(Maxarea);
    }    
}


