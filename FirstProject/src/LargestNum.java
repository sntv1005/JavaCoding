public class LargestNum {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
       
        int max=0;
        int secondLargest =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondLargest= max;
                max= arr[i];
            }
            
           else if(arr[i]> secondLargest && arr[i]!= max){
                secondLargest = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secondLargest);

    }
}
