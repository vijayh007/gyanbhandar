package tenDays;

public class OneH1_NumberOFWaysInNMMatrix {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        System.out.println(findWays(n, m));
    }
    public static int findWays(int n, int m){
        if (n == 1 || m ==1) return 1;
        return findWays(n-1, m) + findWays(n, m-1);
    }
}
