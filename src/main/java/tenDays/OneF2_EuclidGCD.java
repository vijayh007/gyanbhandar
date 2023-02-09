package tenDays;

public class OneF2_EuclidGCD {
    public static void main(String[] args) {
        System.out.println(gcd(12,40));
    }
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}
