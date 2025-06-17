package com.example.JavaCodingPractice.Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Linearsearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,3,7,8,9,0};
        int target= 3;
        System.out.println("before Sorting an array is :"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("after sorting an array is :"+Arrays.toString(arr));
        int result = linearSearch(arr,target);
        List<Integer> res = linearSearchAllOccurrences(arr, target);
        if (!res.isEmpty()) {
            System.out.println("Element " + target + " found at indices: " + res);
        } else {
            System.out.println("Element not found.");
        }

        if(result != -1){
            System.out.println("element found at : "+result);
        } else {
            System.out.println("element nt found");
        }
    }

    private static List<Integer> linearSearchAllOccurrences(int[] arr, int target) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indices.add(i);
            }
        }
        return indices;
    }

    private static int linearSearch(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return  i;
            }
        }
        return -1;
    }
}
