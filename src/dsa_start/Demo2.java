//Delete an element from Array
package dsa_start;

import java.util.Scanner;


public class Demo2 {
    public static void main(String []args){
       
        System.out.println("Enter any size...");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n-1];
        System.out.println("Enter few values...");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter index number for deleting...");
        int I=sc.nextInt();
       for(int i=0;i<a.length;i++){
           if(i<I){
               b[i]=a[i];
           }
           else if(i==I){
               continue;
           }
           else{
           b[i-1]=a[i];
       }
      }
       for(int i=0;i<n-1;i++){
           System.out.println(b[i]);
       }
    }
        
}
