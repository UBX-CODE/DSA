//Leetcode Q.912
package Recursion;
import java.util.*;

public class SortArray{
    public static void sortArray(ArrayList<Integer> arr){
        if(arr.size() <= 1){
            return;
        }
        int temp = arr.remove(arr.size() - 1);

        sortArray(arr);

        insert(arr, temp);
    }
    public static void insert(ArrayList<Integer> arr, int temp){
        if(arr.size() == 0 || arr.get(arr.size() - 1) <= temp){
            arr.add(temp);
            return;
        }
        int val = arr.remove(arr.size() - 1);

        insert(arr, temp);

        arr.add(val);
    }
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(3);
        arr.add(1);
        arr.add(4);
        arr.add(2);
        arr.add(5);

        sortArray(arr);

        System.out.println(arr);
    }
}