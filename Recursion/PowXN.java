//Leetcode Q.50
package Recursion;
import java.util.*;

public class PowXN{
    public static double power(double x,long n){
        if(n == 0){
            return 1;
        }
        double half = power(x, n/2);
        if(n % 2 == 0){
            return half * half;
        }

        return x*half*half;
    }
    public static double myPow(double x , int n){
        long N = n;

        if(N < 0){
            x = 1 / x;
            N = -N;
        }
        return power(x,N);
    }

    public static void main(String args[]){
        double x = 2;
        int n = 8;

        System.out.println(myPow(x,n));
    }
}