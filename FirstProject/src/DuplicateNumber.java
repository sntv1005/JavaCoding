public class DuplicateNumber {

    public static void main(String[] args) {
        
        int[] arr= {1,2,3,4,5,6,7,1,2,3,4,6,9,0};
       duplicate(arr);
    }

    static void duplicate(int[] arr){

        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("duplicate numbers are :"+ arr[i]);
                    temp= arr[i];
                    System.out.println(temp);
                    break;
                }
            }
        }
    }
    
}
