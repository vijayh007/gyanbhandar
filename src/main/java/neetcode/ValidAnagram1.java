package neetcode;

public class ValidAnagram1 {
    public static void main(String[] args) {
        String str = "abcde";
        String str1 = "bcade";
        System.out.println(isAnagram(str, str1));

    }
    private static boolean isAnagram(String str, String str1){
        if(str.length() != str1.length()) return  false;
        int[] store = new int[26];

        for (int i = 0; i < str.length(); i++) {
            store[str.charAt(i) - 'a']++;
            store[str1.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }
}
