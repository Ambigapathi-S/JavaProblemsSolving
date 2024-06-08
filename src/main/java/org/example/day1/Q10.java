package org.example.day1;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * 3;
            System.out.print(sum + " ");

        }
    }
}
//    Q10.Write a program to generate the first n terms in the series --- 3, 9, 27, 81,....,
//        Input format:
//        The input containing an integer which denotes 'n'
//        Output format:
//        Print the series and refer the sample output for formatting
//        Sample Input:
//        6
//        Sample Output:
//        3 9 27 81 243 729
//
//        Case 1
//        Input (stdin)
//        10
//
//        Output (stdout)
//        3 9 27 81 243 729 2187 6561 19683 59049
//        Case 2
//        Input (stdin)
//        8
//
//        Output (stdout)
//        3 9 27 81 243 729 2187 6561
//
//
//        Solution:
//        6
//        3 9 27 81 243 729