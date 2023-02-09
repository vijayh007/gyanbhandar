package tenDays;

public class OneI_StringRecursion {
    public static void main(String[] args) {
        //1 . Palindrome String
        String str  = "abccba";
        System.out.println(palindrome(str, 0, str.length()-1));

        //2. Print the powerset(subsequence) of given String Complexity : O(2^n)
        String str1 = "abc";
        powerset(str1, 0, "");
    }
    public static void  powerset(String s, int i, String curr){
        if(i == s.length()){
            System.out.println(curr);
            return;
        }
        powerset(s, i+1, curr+s.charAt(i));
        powerset(s, i+1, curr);
    }
    public static boolean palindrome(String str, int s, int e){
        if(s >= e) return true;
        if (str.charAt(s) != str.charAt(e)){
            return  false;
        }

        return palindrome(str, s+1, e-1);
    }
}
