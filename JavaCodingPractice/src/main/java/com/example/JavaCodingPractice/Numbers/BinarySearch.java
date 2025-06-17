package com.example.JavaCodingPractice.Numbers;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,67,8,9};
        int target = 9;
        Arrays.sort(arr);
        int result = binarySearch(arr,target);
        if (result != -1)
            System.out.println("Found at index: " + result);
        else
            System.out.println("Element not found.");
    }

    private static int binarySearch(int[] arr, int target) {
        int left =0, right = arr.length-1;

        while(left<=right){
            int mid= (left+right)/2;
            if(arr[mid]== target){
                return mid;
            }else if(arr[mid]< target){
                left= mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }
}
