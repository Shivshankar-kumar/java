package arrayList;
//Write a program to calculate fibbonacci Series Using Array.

import java.util.Scanner;

public class fibonacci {
    /*public static void printArray(int []arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n=sc.nextInt();
        int[]arr=new int[n];
        
        // System.out.println("Enter "+ n + "Elements");
        // for(int i=0; i<n; i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println("Original Array");
        // printArray(arr);
        
        arr[0]=0;
        for(int i=2; i<n; i++){
            arr[1]=1;
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println("\nFibonacci Series");
        printArray(arr);
    }*/
//Using Recursion
static int f(int n){
    //Base Case
    if(n==1|| n==0){
    return n;
    }
    return f(n-1)+f(n-2); 
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int n=sc.nextInt();
    System.out.println(f(n));   
}
}