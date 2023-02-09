package basic;

public class FactorialRecursion {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("factorial of " +n + " is " + result);
    }
    public static int factorial(int num){
        if(num == 0) return 1;
        return num*factorial(num-1);
    }
}
