package com.cp.practice.memoizationSolution;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbingStairs {
    public static int [] dp = new int[50];

    // Initialize all number of steps to be taken to -1
    static{
        Arrays.fill(dp, -1);
        // Num of ways to climb down the 1st stair = 1
        dp[1] = 1;

        // Num of ways to climb 2nd stair = either you take 1 step from 1st stair              or  you take double step from 2nd stair => 2
        dp[2] = 2;
    }

    public static int climbStairs(int n) {
        if(dp[n] == -1) {
            for(int i=3; i<=n; i++){
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the number of stairs - ");
        n = Integer.parseInt(sc.next());

        System.out.println("Number of ways - " + climbStairs(n));
    }
}
