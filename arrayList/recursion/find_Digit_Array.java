package arrayList.recursion;

import java.util.Scanner;

//import operator.bool;

public class find_Digit_Array {
    public static boolean find_Occurances(int []arr,int idx,int key){
        //Base Case
        if(idx==arr.length){
            return false;
        } 
        return (arr[idx]==key) || find_Occurances(arr, idx+1, key);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Length");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the Array Element");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Find Element in Array");
        int key=sc.nextInt();
        boolean ans=find_Occurances(arr, 0, key);
        /*if(ans==key){
        System.out.println("Yes Present The Number "+ans);
    }
    else{
        System.out.println("Number is Not Present in array");
    }*/
    System.out.println(ans);
}
}
