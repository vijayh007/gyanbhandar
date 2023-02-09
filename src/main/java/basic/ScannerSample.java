package basic;

import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int sum = i+j;
        System.out.println("Sum of " + i + " and " + j +" is " + sum);
    }
}
