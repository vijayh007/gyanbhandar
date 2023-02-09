package tenDays;

import java.util.Arrays;

public class OneF1_SieveOfEratosthenes {
    public static void main(String[] args) {
        int number = 30;
        boolean[] result = sieveOfEratosthenes(number);
        //System.out.println(Arrays.toString(result));
        for (int i = 1; i<= number; i++){
            System.out.println( i +" " + result[i]);
        }

    }

    public static boolean[] sieveOfEratosthenes(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i*i < n ; i++){
            for (int j = 2*i; j <= n; j+=i){
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
}
