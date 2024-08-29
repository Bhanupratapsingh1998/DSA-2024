package com.dsa2024.Greedy_algo;

/*
 * A Naive recursive implementation
 * of 0-1 Knapsack problem
 */
public class KnapSack {

    // Returns the maximum value that
    // can be put in a knapsack of
    // capacity W
    static int knapSack(int W, int wt[], int val[], int n) {
        // Base Case
        if (n == 0 || W == 0)
            return 0;

        // If weight of the nth item is
        // more than Knapsack capacity W,
        // then this item cannot be included
        // in the optimal solution
        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);

        // Return the maximum of two cases:
        // (1) nth item included
        // (2) not included
        else
            return Math.max(knapSack(W, wt, val, n - 1),
                    val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1));
    }

    public static void main(String args[]) {
        int profit[] = new int[] { 1, 2, 3 };
        int weight[] = new int[] { 4, 5, 6 };
        int W = 3;
        int n = 3;
        System.out.println(knapSack(W, weight, profit, n));
    }
}
