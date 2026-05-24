package Arrays;
import java.util.*;

public class DifferenceOfArrays {
    public static void main(String args[]){
        int nums1[] = {1,2,3};
        int nums2[] = {2,4,6};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            set2.add(num);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int num : set1){
            if(!set2.contains(num)){
                list1.add(num);
            }
        }
        for(int num : set2){
            if(!set1.contains(num)){
                list2.add(num);
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        result.add(list1);
        result.add(list2);

        System.out.println(result);
    }
}
