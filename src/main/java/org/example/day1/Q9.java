package org.example.day1;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int sum = 6;
        for (int i = 0; i < n; i++) {
            sum = sum + (5 * i);
            System.out.print(sum + " ");

        }
    }
}
//    Q9.Write a program to generate the following series --- 6,11,21,36,56,...
//        Input format:
//        The input containing an integer which denotes 'n'
//        Output format:
//
//        Print the series and refer the sample output for formatting.
//        Sample Input:
//        6
//        Sample Output:
//        6 11 21 36 56 81
//
//        Case 1
//        Input (stdin)
//        5
//        Output (stdout)
//        6 11 21 36 56

//        Case 2
//        Input (stdin)
//        7
//        Output (stdout)
//        6 11 21 36 56 81 111

//        Solution:
//        7
//        6 11 21 36 56 81 111