/*
    1
    2 3
    4 5 6
    7 8 9 10
*/
import java.util.*;

public class Pattern13 {
    public static void main(String args[]){
        int n=4;
        int x=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(x);
                System.out.print(" ");
                x = x + 1;
            }
            System.out.println();
        }
    }
}
