//Insertion
package dsa_start;

import java.util.Scanner;


public class Demo {
    
    public static void main(String [] args){
       
        /*System.out.println("Enter any size...");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Here are the values...");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
      */
        //[Array Insertion]
        int p;
        System.out.println("Enter any size...");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[n+1];
        System.out.println("Enter some value...");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter index number for entering some value...");
        p=sc.nextInt();
        System.out.println("Enter some value...");
        int m=sc.nextInt();
        
        for(int i=0;i<n+1;i++){
            if(i<p){
                arr2[i]=arr[i];
            }
            else if(i==p){
                arr2[i]=m;
            }
            else{
                arr2[i]=arr[i-1];
            }
        }
        System.out.println("Here are your last result...");
        for(int i=0;i<n+1;i++){
            System.out.println(arr2[i]);
        }
        
        
       
        
        
            
        
    }
    
}
