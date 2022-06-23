package com.cp.practice.recursiveSolution;

import java.util.Scanner;

public class ClimbingStairs {

    public static int climbStairs(int n){
        if(n == 0)  return 1;
        else if(n < 0) return 0;
        else return climbStairs(n-1) + climbStairs(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the number of stairs to climb - ");
        n = Integer.parseInt(sc.next());

        System.out.println("Number of ways - " + climbStairs(n));
    }
}
