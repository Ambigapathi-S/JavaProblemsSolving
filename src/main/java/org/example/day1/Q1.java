package org.example.day1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        scanner.close();
        System.out.println((int) c);
    }
}

//    Q1.Write a program to get a character as input and print its Unicode value. When a character
//        is entered,the character itself is not stored. Instead, a numeric value(Unicode value) is stored.
//        Sample Input :
//        g
//        Sample Output:
//        103
//
//        Case 1
//        Input (stdin)
//        G
//        Output (stdout)
//        71
//
//        Case 2
//        Input (stdin)
//        B
//        Output (stdout)
//        66
//
//
//        Solution:
//        g
//        103
//        G
//        71