package Arrays;
import java.util.*;

public class SpiralMatrix {
    public static void main(String args[]){
    int matrix[][] = {{1,2,3},
                    {4,5,6},
                    {7,8,9}};
    ArrayList<Integer> list = new ArrayList<>();
    int n = matrix.length;
    int top = 0;
    int left = 0;
    int right = matrix[0].length - 1;
    int bottom =n-1; 

    while(left <= right && top <= bottom){
        for(int col = left; col <= right; col++){
            list.add(matrix[top][col]);
        }
        top++;
        for(int row = top; row <= bottom; row++){
            list.add(matrix[row][right]);
        }
        right--;
        if(top<=bottom){
            for(int col = right; col>=left; col--){
                list.add(matrix[bottom][col]);
            }
            bottom--;
        }
        if(left<=right){
            for(int row = bottom; row>=top; row--){
                list.add(matrix[row][left]);
            }
            left++;
        }
    }
    System.out.println(list);
    }
}

