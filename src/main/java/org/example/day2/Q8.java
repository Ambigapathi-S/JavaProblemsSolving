package org.example.day2;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int n = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if(j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(n);
                    n++;
                }
            }
            n = 1;
            System.out.println();
        }
    }
}

//    Q8.WAP to print following pattern.
//        Input:5
//        Output:
//        1*2*3
//        1*2*3
//        1*2*3
//        1*2*3
//        1*2*3
//
//        Solution:
//        5
//        1*2*3
//        1*2*3
//        1*2*3
//        1*2*3
//        1*2*3