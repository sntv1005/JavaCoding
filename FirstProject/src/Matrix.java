import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();

        int[][] mat= new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]= sc.nextInt();
            }
        }

        for(int j=0;j<mat[0].length;j++) {
            if(j% 2 == 0) {
                for(int i=0;i<mat.length;i++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for(int i=mat.length-1;i>=0;i--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        } 
     }
    }
    

