package Streams;

import java.util.Arrays;

public class AvgOfNumbers {

    public static void main(String[] args) {
        
        int[] arr= {1,2,3,4,5,6,7,8,9};

        // double a= Arrays.stream(arr).average().getAsDouble();
        // System.out.println(a);

        int n = arr.length;
        double sum=0;
        double avg=0.0;
    //    for(int num : arr){
    //     sum += num;
    //     avg= sum/n;
    //    }
       for(int i=0;i<=n ;i++){
        sum +=i;
        avg = sum/n;
       }

       System.out.println(avg);
    }
}
