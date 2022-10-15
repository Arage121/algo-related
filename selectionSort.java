package com.algorithms;

import java.util.*;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {2,-43,0,78,90,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
    for(int i=0; i< arr.length;i++){
     // find the max index in the remaining array and swap with correct index
        int last = arr.length-i-1;
        int maxIndex = getMaxElementIndex(arr, 0, last);
        swap(arr, maxIndex, last);
    }
    }

    static void swap(int[] arr, int first, int second){
      int temp = arr[first];
      arr[first] = arr[second];
      arr[second] = temp;
    }

    static int getMaxElementIndex(int arr[], int start, int end){
     int max = start;
     for(int i=start; i<end;i++){
       if(arr[max]<arr[i]){
         max = i;
       }
     }
     return max;
    }

}
