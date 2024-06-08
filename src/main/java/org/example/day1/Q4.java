package org.example.day1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        float res1 = (x1+x2)/2;
        float res2 = (y1+y2)/2;
        System.out.print("(");
        System.out.printf("%.2f", res1);
        System.out.print(" , ");
        System.out.printf("%.2f", res2);
        System.out.print(")");
    }
}
//Q4.Ajay, Binoy, and Chandru were very close friends at school. They were very good in Mathematics and they were the pet students of Emily Mam. Their
//        gang was known as 3-idiots. Ajay, Binoy, and Chandru live in the same locality. A new student Dinesh joins their class and he wanted to be friends
//        with them. He asked Binoy about his house address. Binoy wanted to test Dinesh's mathematical skills. Binoy told Dinesh that his house is at the
//        midpoint of the line joining Ajay's house and Chandru's house. Dinesh was puzzled. Can you help Dinesh out? Given the coordinates of the 2 endpoints
//        of a line (x1,y1) and (x2,y2), write a  program to find the midpoint of the line.
//        Input Format:
//        Input consists of 4 integers.
//        The first integer corresponds to x1 .
//        The second integer corresponds to y1.
//        he third integer corresponds to x2.
//        he fourth integer corresponds to y2.

//        Output Format:
//        Refer Sample Input and Output for exact formatting specifications.
//        [All floating point values are displayed correct to 1 decimal place]
//        Sample Input:
//        2
//        4
//        10
//        15

//        Sample Output:
//        Binoy's house is located at (6.0,9.5)
//        Case 1
//        Input (stdin)
//        9
//        6
//        5
//        3

//        Output (stdout)
//        Binoy's house is located at (7.0,4.5)
//        Case 2
//        Input (stdin)
//        5
//        4
//        3
//        2

//        Output (stdout)
//        Binoy's house is located at (4.0,3.0)
//        Solution:
//        2
//        4
//        10
//        15
//        (6.00 , 9.00)