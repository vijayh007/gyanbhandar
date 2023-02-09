package problems;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strArray = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams1(strArray));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> resultMap = new HashMap<>();
        for (String str: strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);
            if(!resultMap.containsKey(sortedStr)){
                resultMap.put(sortedStr, new LinkedList<>());
            }
            resultMap.get(sortedStr).add(str);
        }
        return new LinkedList<>(resultMap.values());
    }

    public static List<List<String>> groupAnagrams1(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray())
                count[c - 'a']++;

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
