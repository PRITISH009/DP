package com.cp.practice.recursiveSolution;

import java.util.Scanner;

public class FibonacciNumber {

    // Basic Fibonacci Number Code -
    public static int f(int n){
        if(n <= 2) return 1;
        return f(n-1) + f(n-2);
    }

    public static void main(String[] args) {
        System.out.println("Enter n for F(n)");
        int n;

        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());

        System.out.println("Fibonacci Number - " + f(n));
    }
}
