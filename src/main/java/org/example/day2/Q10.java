package org.example.day2;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int org = n;
        int sum = 0;
        while(n != 0) {
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        if(org % sum == 0) {
            System.out.println("Harshad number");
        } else {
            System.out.println("Not a Harshad number");
        }
    }
}

//    Q10.Write a program to check whether a given number is a Harshad number or not.
//
//        Input: A single integer representing the number to be checked.
//
//        Output: Print "Harshad number" if the input number is a Harshad number, otherwise print "Not a Harshad number
//
//        Hint:
//        A Harshad number  is an integer that is divisible by the sum of its digits.
//        For example, 18 is a Harshad number because 1 + 8 = 9 and 18 is divisible by 9.
//
//
//        Solution:
//        19
//        Not a Harshad number