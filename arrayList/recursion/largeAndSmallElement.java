package arrayList.recursion;

//Write A Program to Find smallest and larger value in array using recursion.

import java.util.Scanner;

public class largeAndSmallElement {
    static int largestElment(int []arr,int idx,int n){
        int larg;
        //Base Case
        if(idx==n) return 0;
        //recursive ,subProblem
        larg=largestElment(arr, idx+1, n);
        if(larg<arr[idx])
        return arr[idx];
        return larg;
    }
    static int minimum(int []arr,int idx,int n){
        int min;
        //Base Case
        if(idx==n-1) return arr[idx];
        min=minimum(arr, idx+1, n);
        if(min>arr[idx]) return arr[idx];
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size Of Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Array Element");
        for(int i=0; i<size; i++)
        arr[i]=sc.nextInt();
        int n=arr.length;
        int larger=largestElment(arr, 0, n);
        int smallest=minimum(arr, 0, n);
        System.out.println("larger value In Array:"+" "+larger);
        System.out.println("Smallest value On Array:"+" "+smallest);


    }
}
