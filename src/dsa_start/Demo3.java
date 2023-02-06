//2-D array
package dsa_start;

import java.util.Scanner;


public class Demo3 {
    public static void main(String[] args) {
        System.out.println("Enter the size of row...");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        System.out.println("Enter the size of column...");
        int column=sc.nextInt();
        int arr[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
         for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
             System.out.println();
        }
        
        
    }
}
