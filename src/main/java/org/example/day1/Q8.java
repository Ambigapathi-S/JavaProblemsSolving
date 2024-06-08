package org.example.day1;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n % 3 == 0) {
            System.out.println("Not a Trendy Number");
        } else {
            System.out.println("Trendy Number");
        }
    }
}

//    Q8.Write a program to check whether the given number is a trendy number or not. A number is said to be a trendy number if and only if it has 3 digits
//        and the middle digit is divisible by 3.
//        Input format:
//
//        The input containing an integer 'n' which denotes the given number
//        Output format:
//
//        If the given number is a trendy number, then print "Trendy Number". Otherwise, print "Not a Trendy Number".
//
//        Sample Input:
//        791
//
//        Sample Output:
//        Trendy Number
//
//        Case 1
//        Input (stdin)
//        791
//
//        Output (stdout)
//        Trendy Number
//        Case 2
//        Input (stdin)
//        3
//
//        Output (stdout)
//        Not a Trendy Number
//        Case 3
//        Input (stdin)
//        45
//
//        Output (stdout)
//        Not a Trendy Number
