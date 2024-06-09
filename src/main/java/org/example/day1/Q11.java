package org.example.day1;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while(n != 0) {
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
