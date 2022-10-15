package com.algorithms;
import java.util.*;

public class containsDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        int i;
        Arrays.sort(nums);
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                return true;
        }
        return false;
    }
}
