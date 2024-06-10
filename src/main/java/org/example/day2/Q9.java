package org.example.day2;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean isprime = isPrime(n);
        if(isprime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        // Check from 2 to n/2
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
//    Q9.Write a program to check whether a given number is prime or not.
//        Input:17
//        Output:
//        17 is a prime number.
//
//        Solution:
//        20
//        20 is not a prime number