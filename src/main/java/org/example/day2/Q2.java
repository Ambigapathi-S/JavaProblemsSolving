package org.example.day2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int x = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if(x == 0) {
                    x = 1;
                } else {
                    x = 0;
                }
                System.out.print(x);
            }
            System.out.println();
        }
    }
}

//    Q2.WAP to print following pattern.
//        Input:
//        5
//        5
//
//        Output:
//        10101
//        01010
//        10101
//        01010
//        10101
//
//
//        Solution:
//        5 5
//        10101
//        01010
//        10101
//        01010
//        10101