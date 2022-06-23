package com.cp.practice.spaceOptimizedSolution;

import java.util.Scanner;

public class FibonacciNumber {

    public static int f(int n) {
        if(n <= 2) return 1;
        int prev, prev2;

        prev = 1;
        prev2 = 1;

        int curr = 0;

        for(int i=3; i<=n; i++){
            curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }

        return curr;
    }

    public static void main(String[] args) {
        System.out.println("Enter n to get F(n) - ");
        int n;

        Scanner sc = new Scanner(System.in);

        n = Integer.parseInt(sc.next());

        System.out.println("F(n) - " + f(n));

    }
}
