package org.example.day1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}

//    Q2.Write a java program to get 2 numbers from the user and swap their values without any loss of data. You can make use of additional variable for swapping. Print the corresponding swapped values of the two numbers as output in the console.
//        Input format:
//        First input: an integer
//        Second input: an integer

//        Output format:
//        The output will be integers(swapped values)

//        Sample Input:
//        20
//        10

//        Sample Output:
//        10
//        20

//        Case 1
//        Input (stdin)
//        20
//        10

//        Output (stdout)
//        10
//        20
//        Case 2
//        Input (stdin)
//        5
//        10
//
//        Output (stdout)
//        10
//        5