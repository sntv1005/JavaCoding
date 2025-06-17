package com.example.JavaCodingPractice.Numbers;

public class Arrays {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,8,9};
        int[] array = {3,2,8,6,5,9,1,0,19,10,16,16,1,19};
        missingNumberFromAnArray(arr);
        
        sortAnArrayInAscendingOrder(array);

        sortAnArrayInDescendingOrder(array);

        sumOfAnArray(array);

        highestElementFromAnArray(array);

        lowestElemetOfAnArray(array);

        secondHighestElement(array);

        secondLowest(array);

        duplicateElements(array);

        distinctElements(array);
    }

    private static void distinctElements(int[] array) {
        System.out.print("Distinct elements: ");
        int count=0;
        for (int i = 0; i < array.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                System.out.print(array[i] + " ");
                count++;
            }
        }
        System.out.print("count of distinct elemnts are : " +count);
        System.out.println();
    }


    private static void duplicateElements(int[] array) {
    int temp=0;
        for(int i=0; i<array.length;i++){
            for(int j=i+1; j<array.length;j++){
                if(array[i] == array[j]){
                    System.out.println("duplicates found at : "+array[i]);
                    temp= array[i];
                }
            }
        }
    }

    private static void secondLowest(int[] array) {

        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        for(int num : array){
            if (num < lowest){
                secondLowest = lowest;
                lowest= num;
            } else if (num < secondLowest && num != lowest) {
                secondLowest = num;
            }
        }
        System.out.println("second lowest element is : " +secondLowest);
        System.out.println();
    }
    private static void secondHighestElement(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }

//        if (secondHighest == Integer.MIN_VALUE) {
//            System.out.println("No second highest element found.");
//        } else {
//            System.out.println("Second highest element is: " + secondHighest);
//        }
        System.out.println();
    }

    private static void lowestElemetOfAnArray(int[] array) {

        int lowest =0;
        for(int i=0; i<array.length;i++){
            if (array[i]< lowest){
                lowest=array[i];
            }
        }
        System.out.println("lowest element is : " +lowest);
        System.out.println();
    }

    private static void highestElementFromAnArray(int[] array) {
        int highest=0;


        for(int i =0 ; i<array.length;i++){
            if(array[i]> highest){
                highest= array[i];
            }
        }
//        for(int num : array){
//            if(num > highest){
//                highest= num;
//            }
//
//        }
        System.out.println("highest element of an array is : " +highest);
        System.out.println();

    }

    private static void sumOfAnArray(int[] array) {
        int sum =0;
        for (int num : array){
            sum +=num;
        }
        System.out.print("sum of an array is : "+sum);
        System.out.println();
    }

    private static void sortAnArrayInDescendingOrder(int[] array) {
        int temp;

        for (int i=0; i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]< array[j+1]){
                    temp = array[j];
                    array[j]= array[j+1];
                    array[j+1]= temp;
                }
            }
        }
        System.out.print("Descending Order : ");
        for(int num : array){
            System.out.print(num + " ");
        }
        System.out.println();

    }

    private static void sortAnArrayInAscendingOrder(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

    private static void missingNumberFromAnArray(int[] arr) {

        int actualSum=0;
        int n = arr.length+1;
        int expectedSum= n*(n+1)/2;

//        for(int i=0;i<n;i++){
//            actualSum +=arr[i];
//        }
        for( int nums :arr){
            actualSum += nums;
        }
        System.out.println(actualSum);
        System.out.println(expectedSum);
        System.out.println("missing number is :"+(expectedSum-actualSum));

    }
}
