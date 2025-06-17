public class LinearSearch {
    
    public static void main(String[] args) {
        
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;

        // for(int i=0; i<arr.length;i++){
        //     if(arr[i]== x){
        //         System.out.println("element found at index : "+i);
        //         break;
        //     } else{
        //         System.out.println("element not found");
        //     }
        // }

        int result= linearSearch(arr, arr.length, x);
        if(result== -1){
            System.out.println("element not found ");
        }else {
            System.out.println("element found at :"+result);
        }
    }

    public static int linearSearch(int arr[], int N, int x)
    {
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
   
    }

