package Arrays;
import java.util.*;

public class SetMatrixZeros{
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},
                        {4,0,6},
                        {7,8,9} };
        
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();
        
        int n = matrix.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(rows.contains(i) || cols.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}