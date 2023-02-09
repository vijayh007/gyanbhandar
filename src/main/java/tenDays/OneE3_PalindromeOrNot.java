package tenDays;

public class OneE3_PalindromeOrNot {
    public static void main(String[] args) {
        int number = 1221;
        int result = reverseNumber(number);
        if(number == result){
            System.out.println(number +" is palindrome");
        }else {
            System.out.println(number +" is not palindrome");
        }
        System.out.println("reverse of "+ number + " is : " + result);

    }
    public static int reverseNumber(int n){
        int result = 0;
        while(n>0) {
            int rem = n % 10;
            n = n / 10;
            result = result * 10 + rem;
        }
        return result;

    }
}
