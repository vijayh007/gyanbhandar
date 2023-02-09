package tenDays;

/*
Steps for recursion :
1. find the base condition
2. find the relation between problem and subproblem
3. Generalise the problem
 */
public class OneG1_Recursion {

    public static void main(String[] args) {
        int n = 5;
        //sum for N Natural numbers
       // System.out.println(sum(n));

        int a  = 2;
        int b = 3;
        //calculate a^b
        System.out.println(power(a, b));
    }

    public static int power(int a, int b){
        if(b == 0) return 1;

        return a * power(a,b-1);
    }

    public static int sum(int n){
        if(n== 0) return 0;
        return n + sum(n-1);
    }
}
