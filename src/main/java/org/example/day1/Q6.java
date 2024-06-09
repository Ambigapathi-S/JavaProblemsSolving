package org.example.day1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,b=1,c=0;
        if(n==1)
        {
            System.out.print(a);
        }else if(n==2)
        {
            System.out.print(b);
        }else
        {
            for(int i=3;i<=n;i++)
            {
                c=a+b;
                a=b;
                b=c;
            }
            System.out.print(c);
        }
    }
}
//    Q6.The environmental eco-club has discovered a new Amoeba that grows in the order of a Fibonacci series every month. They are exhibiting
//        their amoeba in a national conference. They want to know the size of the amoeba at a particular time instant. If a particular month’s index
//        is given, write a program to displays the amoeba’s size……??? For Example, The size of the amoeba on month 1, 2, 3, 4, 5, 6, ..will be 0, 1, 1, 2, 3, 5, 8
//        respectively.
//        Input format:
//
//        The first input containing an integer which denotes the number of the month
//        Output format:
//        Print the amoeba size.
//        Sample Input:
//        7
//        Sample Output:
//        8
//
//        Case 1
//        Input (stdin)
//        7
//
//        Output (stdout)
//        8
//
//        Case 2
//        Input (stdin)
//        13
//
//        Output (stdout)
//        144
//
//        Case 3
//        Input (stdin)
//        4
//        Output (stdout)
//        2
//
//        Solution:
