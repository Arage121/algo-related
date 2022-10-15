package com.algorithms;

import java.util.*;

public class bubbleSort { // in this sort we compare the corresponding values and swap if previous one is greater than the present one
    public static void main(String[] args) {
    int[] arr = {7,5,3,1,0};
    bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        // run the steps n-1 times
        for(int i=0; i<arr.length; i++){
            swapped = false;
            // for each step of value i, the largest value will come at last respective index of the array
            for(int j=1; j< arr.length-i; j++){
                //swap if the value is smaller than the previous item
                if(arr[j] < arr[j-1]) {
                    //swap formula
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular value of i, it means the array is sorted hence stop the program there is no need to again run the loop
            if(!swapped){ // !false == true
                break;
            }
        }
    }
}
