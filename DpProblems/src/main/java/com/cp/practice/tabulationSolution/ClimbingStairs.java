package com.cp.practice.tabulationSolution;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbingStairs {

    public static int[] mem = new int[50];

    static {
        Arrays.fill(mem, -1);
        mem[1] = 1;
        mem[2] = 2;
    }

    public static int climbStairs(int n) {
        if(mem[n] == -1) {
            mem[n] = climbStairs(n-1) + climbStairs(n-2);
        }
        return mem[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the number of stairs - ");
        n = Integer.parseInt(sc.next());

        System.out.println("Number of ways - " + climbStairs(n));
    }
}
