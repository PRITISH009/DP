package com.cp.practice.tabulationSolution;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumber {

    public static int f(int n) {
        int[] dp = new int[n+1];

        Arrays.fill(dp, -1);

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        if(n <= 2) return dp[n];

        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println("Enter n for F(n) - ");
        int n;

        Scanner sc = new Scanner(System.in);

        n = Integer.parseInt(sc.next());

        System.out.println("F(n) - " + f(n));
    }
}
