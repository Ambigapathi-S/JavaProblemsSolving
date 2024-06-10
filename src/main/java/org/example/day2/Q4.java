package org.example.day2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        char c;
        int n = 65;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                c = (char) n;
                System.out.print(c);
                n++;
            }
            System.out.println();
        }
    }
}
//    Q4.WAP to print following pattern.
//        Input:5
//        Output:
//        ABCDE
//        FGHIJ
//        KLMNO
//        PQRST
//        UVWXY
//
//        Solution:
//        5
//        ABCDE
//        FGHIJ
//        KLMNO
//        PQRST
//        UVWXY