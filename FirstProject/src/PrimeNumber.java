import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();

        if( num<2){
            System.out.println("not a plaindrome");
        }

        for(int i=2; i<num/2;i++){
            // if((num % 1 ==0) && (num % num ==0 )){
            //     System.out.println("prime number ");
            //     break;
            // } else {
            //     System.out.println("not prime");
            // }
            if(num % i ==0){
                System.out.println("Not a prime");
                break;
            } else {
                System.out.println("prime");
            }
        }
    }
}
