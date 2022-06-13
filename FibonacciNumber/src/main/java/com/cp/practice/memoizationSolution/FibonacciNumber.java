package com.cp.practice.memoizationSolution;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumber {
    public static int f(int n, int[] dp){
        if(dp[n] == -1){
            dp[n] = f(n-1, dp) + f(n-2, dp);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println("Enter n (less than 1000) for F(n) - ");
        int n;

        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());

        int[] dp = new int [1000];
        Arrays.fill(dp, -1);

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        System.out.println("F(n) - " + f(n, dp));
    }
}
