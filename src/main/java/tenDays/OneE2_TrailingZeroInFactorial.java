package tenDays;

public class OneE2_TrailingZeroInFactorial {
    public static void main(String[] args) {
        int n = 30;
        int result = 0;
        for (int i = 5; i <= n; i= i*5){
            result = result + n/i;
        }
        System.out.println("Trailing Zero In Factorial : "+ n + " is = " + result);
    }
}
