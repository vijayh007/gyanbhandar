package basic;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        String inputString = "150\n" +
                "1 39\n" +
                "1 94\n" +
                "1 69\n" +
                "1 77\n" +
                "1 41\n" +
                "1 77\n" +
                "1 0\n" +
                "1 25\n" +
                "1 98\n" +
                "1 38\n" +
                "1 49\n" +
                "1 51\n" +
                "1 36\n" +
                "1 83\n" +
                "1 97\n" +
                "1 75\n" +
                "1 53\n" +
                "1 50\n" +
                "1 50\n" +
                "1 12\n" +
                "1 70\n" +
                "1 20\n" +
                "1 42\n" +
                "1 31\n" +
                "1 92\n" +
                "1 83\n" +
                "1 77\n" +
                "1 18\n" +
                "1 58\n" +
                "1 96\n" +
                "1 25\n" +
                "1 71\n" +
                "1 17\n" +
                "1 73\n" +
                "1 39\n" +
                "1 87\n" +
                "1 60\n" +
                "1 29\n" +
                "1 11\n" +
                "1 55\n" +
                "1 88\n" +
                "1 68\n" +
                "1 66\n" +
                "1 54\n" +
                "1 85\n" +
                "1 45\n" +
                "1 7\n" +
                "1 6\n" +
                "1 48\n" +
                "1 15\n" +
                "1 6\n" +
                "1 56\n" +
                "1 75\n" +
                "1 64\n" +
                "1 15\n" +
                "1 4\n" +
                "1 30\n" +
                "1 61\n" +
                "1 7\n" +
                "1 80\n" +
                "1 15\n" +
                "1 36\n" +
                "1 52\n" +
                "1 54\n" +
                "1 22\n" +
                "1 85\n" +
                "1 71\n" +
                "1 85\n" +
                "1 69\n" +
                "1 47\n" +
                "1 4\n" +
                "1 13\n" +
                "1 91\n" +
                "1 68\n" +
                "1 98\n" +
                "1 85\n" +
                "1 56\n" +
                "1 80\n" +
                "1 57\n" +
                "1 83\n" +
                "1 32\n" +
                "1 20\n" +
                "1 30\n" +
                "1 0\n" +
                "1 60\n" +
                "1 67\n" +
                "1 16\n" +
                "1 4\n" +
                "1 12\n" +
                "1 63\n" +
                "1 39\n" +
                "1 71\n" +
                "1 11\n" +
                "1 2\n" +
                "1 78\n" +
                "1 55\n" +
                "1 97\n" +
                "1 71\n" +
                "1 21\n" +
                "1 97\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1\n" +
                "2 -1";
        String result = codeHere(inputString);
        System.out.println(result);
    }
public static String codeHere(String inputData) {
        // Use this function to write your solution;
        String[] strArray = inputData.replaceAll("\\[", "").replaceAll("]", "").replaceAll("\n", " ").split(" ");
        int[] store = new int[strArray.length/2];
        int j = 0;
        String resultString = "";
        for(int index = 1; index < strArray.length; index = index+2){
        switch(strArray[index]){
        case "1":
        store[j] = Integer.parseInt(strArray[index+1]);
        j = j+1;
        break;
        case "2":
        resultString =resultString + " ";
        String result = getMaxFrequency(store, j);
      //  List<Integer> list = Arrays.asList(store);
        resultString =resultString+result;
        break;
        }
        }
        return resultString;
        }

public static String getMaxFrequency(int[] arr, int j){
        Map<Integer, Integer> map = new HashMap<>();
        String result = "";
        for(int i =0; i< j; i++){
                if(arr[i] == -1){
                        continue;
                }
                if(map.containsKey(arr[i])){
                        map.put(arr[i], map.get(arr[i])+1);
                }else{
                        map.put(arr[i],1);
                }
        }
        int maxCount = 0;
        Set<Integer> set = new HashSet<>();
        for(Map.Entry<Integer,Integer> val : map.entrySet()) {
                if (val != null) {
                        if (maxCount < val.getValue()) {
                                set.clear();
                                maxCount = val.getValue();
                                set.add(val.getKey());
                        } else if (maxCount == val.getValue()) {
                                set.add(val.getKey());
                        }
                }
        }
        for(; j >0; j--){
        if(set.contains(arr[j])){
                result = Integer.toString(arr[j]);
                arr[j] = -1;
                break;
        }
        }
        return result;
        }
}