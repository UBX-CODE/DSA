package Arrays;
import java.util.*;

public class GroupAnagrams{
    public static void main(String args[]){
        HashMap<String, List<String>> map = new HashMap<>();
        String strs[] = {"eat","tea","tan","ate","nat","bat"};

        for(String s : strs){
            char arr[] = s.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            if(!map.containsKey(key)){
                map.put(
                    key,new ArrayList<>()
                );
            }
            map.get(key).add(s);
        }
        System.out.println(map);
    }
}