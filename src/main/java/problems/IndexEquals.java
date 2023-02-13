package problems;

public class IndexEquals {
    public static void main(String[] args) {
        int[] arr = {0,4,-1,0,3};
        int[] arr1 = {0,-2,5,0,3};
        System.out.println(solution(arr, arr1));
    }
    public static int solution(int[] A, int[] B) {
        // Implement your solution here
        int ASum = 0;
        for(int i= 0; i < A.length;i++){
            ASum = ASum+A[i];
        }
        int BSum = 0;
        for(int i= 0; i < B.length;i++){
            BSum = BSum+B[i];
        }
        int sumTillA = 0;
        int sumTillB = 0;

        for (int i = 0; i < A.length; i++){
            sumTillA = sumTillA+A[i];
            sumTillB = sumTillB+B[i];
            if(sumTillB == sumTillA && (ASum-sumTillA == sumTillA) && (BSum-sumTillB == sumTillB)){
                return i;
            }
        }
        return 0;
    }
}
