package com.algorithms;

public class prob {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        System.out.println(sumOfUnique(arr));
    }
    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int count = 0;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[i] == nums[j])
                    count++;
            }
            if(count == 1)
                sum = sum + nums[i];
        }
        return sum;
    }
}
