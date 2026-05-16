/*

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

*/
import java.util.*;

public class Pattern19 {
    public static void main(String args[]){
        int n = 5;
    for(int i=1; i<=n; i++){
        //left
        for(int j=0; j<n-i+1; j++){
            System.out.print("*");
        }
        //spaces
        for(int j=0; j<2*i-2; j++){
            System.out.print(" ");
        }
        //right
        for(int j=0; j<n-i+1; j++){
            System.out.print("*");
        }
    System.out.println();
        }
    //bottom
        for(int i=1; i<=n; i++){
        //right
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        //spaces
        for(int j=1; j<=2*n-2*i; j++){
            System.out.print(" ");
        }
         //left
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
    System.out.println();
        }
    }
}
    
