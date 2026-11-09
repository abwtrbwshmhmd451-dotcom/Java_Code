
package com.mycompany.edu.zuj.vp.forloopexample;
//1. Write a program that prints a triangle of n stars
//2. Write a program that prints a reverse triangle of n stars
import java.util.Scanner;

public class EduZujVpForLoopExample {

    public static void main(String[] args) {
       

        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();

        // 3- Triangle of n stars
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 4- Reverse triangle of n stars
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    

