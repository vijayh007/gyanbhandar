package tenDays;

public class OneI1_StringPermutations {
    public static void main(String[] args) {
        String str = "abc";
        //time complexity O(n*n!) : N*N factorial
        permutaions(str, 0, str.length()-1);
    }
    public static void permutaions(String str, int l, int r){
        if(l == r){
            System.out.println(str);
            return;
        }
        for(int i = l; i <= r; i++){
            str = swap(str, l, i);
            permutaions(str, l+1, r);
            str = swap(str, l, i);
        }
    }
    public static String swap(String str, int a, int b){
        char[] c = str.toCharArray();
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;

        return new String(c);
    }
}
