package org.example.day2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}

//    Q1.WAP to print following pattern.
//        Input:
//        5
//        5
//
//        Output:
//        11111
//        22222
//        33333
//        44444
//        55555
//
//
//        Solution:
//        5 5
//        11111
//        22222
//        33333
//        44444
//        55555