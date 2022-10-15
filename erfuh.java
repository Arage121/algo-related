package com.algorithms;
import java.util.Arrays;

public class erfuh {
        public static int findLucky(int[] arr) {
            Arrays.sort(arr);
            int ans = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                ans++;
                if (i == 0 || arr[i] != arr[i - 1]) {
                    if (ans == arr[i]) {
                        return ans;
                    }
                    ans = 0;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int [] arr = {2,2,3,4};
            int ans=findLucky(arr);
            System.out.println(ans);
        }
}
