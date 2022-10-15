package com.algorithms;
import java.util.*;

public class BinarySearchusingRecursion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,55,66,78};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(binarySearch(arr, target, 0, arr.length-1));
    }

    static int binarySearch(int[] arr, int target, int s, int e){
        if(s > e){  // when u r not able to find the target element and ur start has increased value more than end
            return -1;
        }
        int m = s + (e-s)/2;  //for finding the middle element in bs m=(s+e)/2
        if(arr[m]==target){
            return m;
        }
        if(target < arr[m]){
            return binarySearch(arr, target, s, m-1); // if middle is greater than target vice versa as below
        }

        return binarySearch(arr, target, m+1, e); // as middle element is smaller than the target theefore, it will be present in last area
    }
}
