package com.example.patternproject;
import java.util.Scanner;

public class PatternProject {

    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number to create a right-angled triangle: ");
        int n;
        n = read.nextInt();
        // Outer loop controls the number of rows
        for (int i = 1; i <= n; i++)
        {
            // Inner loop controls the number of stars in the triangle
            for (int j = 1; j <=i; j++ )
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("Enter a number to create a square pattern: ");
        int m;
        m = read.nextInt();
        for (int i =1; i <= m; i++)
        {
            for (int j = 1; j <=m; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Enter a number to create a right triangle pattern with numbers: ");
        int p;
        p = read.nextInt();
        for (int i = 1; i <= p; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
