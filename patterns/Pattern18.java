/*
    E
    ED
    EDC
    EDCB
    EDCBA
*/
import java.util.*;

public class Pattern18 {
    public static void main(String args[]){
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(char j ='E'; j>='E'-i+1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
