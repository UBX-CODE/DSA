/*
    E
    DE
    CDE
    BCDE
    ABCDE
*/

import java.util.*;

public class Pattern10 {
    public static void main(String args[]) {

        int n = 5;

        for(int i=1; i<=n; i++) {

            char ch = (char)('A' + (n-i));

            for(char j=ch; j<='E'; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
