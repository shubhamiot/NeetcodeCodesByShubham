import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    public static void main(String[] args) {
        String[] arr = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> lists = groupAnagram(arr);
        System.out.println(lists);
    }

    private static List<List<String>> groupAnagram(String[] strs) {

            HashMap<String, List<String>> res = new HashMap<>();
            for(String s : strs){
                char[] charArray = s.toCharArray();
                Arrays.sort(charArray);
                String sortedS = new String(charArray);
                res.putIfAbsent(sortedS, new ArrayList<>());
                res.get(sortedS).add(s);
            }

            return new ArrayList<>(res.values());
        }

}
