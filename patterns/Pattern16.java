/*
    A
    BB
    CCC
    DDDD
    EEEEE
*/
import java.util.*;
public class Pattern16 {
    public static void main(String args[]){
        int n = 5;
        for (char i = 'A'; i<='A'+n-1; i++){
            for(int j=0; j<i-'A'+1; j++){
                System.out.print(i);
            } 
            System.out.println();
        }
    }
}
