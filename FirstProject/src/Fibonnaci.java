import java.util.Scanner;

public class Fibonnaci {
    
public static void main(String[] args) {
    
    Scanner sc = new Scanner((System.in));
    System.out.println("enter the number");
    int num= sc.nextInt();

    int a=0;
    int b=1;

    if(num<0){
        System.out.println("number cannnot be a negative");
    }

    if(num==0){
        System.out.println(a);
    }else if(num==1){
        System.out.println(b);
    }else{
        int c=0;
        for(int i=2;i<=num;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }

}
}
