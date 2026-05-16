/*
    ABCDE
    ABCD
    ABC
    AB
    A
*/
import java.util.*;

public class Pattern17 {    
    public static void main(String args[]){
       int n = 4;
       for(int i=0; i<=n; i++) {
        for(char j='A'; j<='A'+n-i; j++){
            System.out.print(j);
        }
        System.out.println();
       }
    }
}
