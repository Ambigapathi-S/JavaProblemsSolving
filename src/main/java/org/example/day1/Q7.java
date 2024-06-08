package org.example.day1;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int s1=0,s2=0,s3=1,s4=0;
        System.out.print(s1 + " ");
        System.out.print(s2 + " ");
        System.out.print(s3 + " ");
        for(int i=4;i<=n;i++)
        {
            s4=s1+s2+s3;
            s1=s2;
            s2=s3;
            s3=s4;
            System.out.print(s4 + " ");
        }

    }
}
//    Q7.Lucas Sequence
//        a = 0, b=0, c=1 are the 1st three terms. All other terms in the Lucas sequence are generated by the sum of their 3 most recent predecessors.
//        Write a program to generate the first n terms of a Lucas Sequence.
//        Input format:
//        The input containing an integer 'n' which denotes the given number
//
//        Output format:
//
//        Print the 'n' terms of the Lucas Sequence, separated by a single space. There are no leading or trailing spaces in the output.
//
//        Sample Input:
//
//        5
//        Sample Output:
//        0 0 1 1 2
//
//        Case 1
//        Input (stdin)
//        10
//
//        Output (stdout)
//        0 0 1 1 2 4 7 13 24 44
//        Case 2
//        Input (stdin)
//        6
//
//        Output (stdout)
//        0 0 1 1 2 4
//        Solution:
//        10
//        0 0 1 1 2 4 7 13 24 44