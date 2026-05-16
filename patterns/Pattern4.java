/*
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
*/
import java.util.*;

public class Pattern4 {
    public static void main(String argS[]){
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<n; i++){
            for(int j=0; j<=n-i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
