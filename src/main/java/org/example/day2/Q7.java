package org.example.day2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
//    Q7.WAP to print following pattern.
//        Input:5
//        Output:
//        12345
//        12345
//        12345
//        12345
//        12345
//
//        Solution:
//        5 5
//        12345
//        12345
//        12345
//        12345
//        12345