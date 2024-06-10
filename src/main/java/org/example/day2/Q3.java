package org.example.day2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//    Q3.WAP to print following pattern.
//        Input:5
//        Output:
//        *****
//        ****
//        ***
//        **
//        *
//
//        Solution:
//        5
//        *****
//        ****
//        ***
//        **
//        *