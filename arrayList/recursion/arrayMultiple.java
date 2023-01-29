package arrayList.recursion;


//WAP to find product of Elements of Given Array Using Recursion.
//Ex- Input: arr[]= {3,4,5,6};     int n=4;
//Output= 3*4*5*6= 360

import java.util.Scanner;
public class arrayMultiple
    /* 
    static int multiply(int []arr, int n){
        //Base Case
        if(n==0)
        return arr[n];
        else
            return (arr[n]* multiply(arr, n-1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number Of Array Size ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the Array Element:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int ans=multiply(arr, n-1);
        System.out.println("Total multiply of Array Element Are"+" "+ans);
    }
}
*/
{
    static int multiply(int []arr,int idx,int n){
        //Base case
        if(idx==n-1) return arr[idx];
        //recursive ,sub problem
        return (arr[idx] * multiply(arr, idx+1, n));
    }
    public static void main(String[] args) {
        int arr[]={5,6,5,10};
        int n=arr.length;
        System.out.println("total Multiplication Of array element= "+multiply(arr, 0, n));
    }
}