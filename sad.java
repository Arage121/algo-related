package com.algorithms;

public class sad {

        public static void main(String[] args) {
            int[] arr = {1,2,3,2,1};
            int[] nums = {3,2,1,4,7};
            int ans = findLength(arr, nums);
            System.out.println(ans);
        }
        public static int findLength(int[] A, int[] B) {
            int m = A.length, n = B.length;
            int[][] dp = new int[m + 1][n + 1];
            int ans = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (A[i] == B[j]) {
                        dp[i + 1][j + 1] = dp[i][j] + 1;
                        ans = Math.max(ans, dp[i + 1][j + 1]);
                    }
                }
            }
            return ans;
        }
}

