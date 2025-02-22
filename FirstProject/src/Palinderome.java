import java.util.Scanner;

public class Palinderome {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        Integer num= sc.nextInt();
        String str= num.toString();

        String st= "";
        for(int i=str.length()-1;i<=0;i--){
           
            st= str.charAt(i);

        }



    }
}
