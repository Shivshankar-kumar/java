 package objectOrientedConcept.Array2_D;

import java.util.Scanner;

public class bubblesort {
    static void printArray(int[]arr){
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
}
static void sorting(int arr[]){
    int n=arr.length;
    int temp=0;
for(int i=0; i<n; i++){
    for(int j=1; j<(n-i); j--){
    if(arr[j-1]>arr[j]){
        //swap elements
    temp=arr[j-1];
    arr[j-1]=arr[j];
    arr[j]=temp;
    }
}
}
}
public static void main(String[] args) {
   /*  Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size:");
    int n=sc.nextInt();
    int[] arr= new int[n];
    System.out.println("Enter "+ n + "Elements");
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    */
    int arr[]={2,78,1,90,23,3,0};
    int n=arr.length;
    System.out.println("Oroginal Array:");
    printArray(arr);
    sorting(arr);
    System.out.println("\nSorting Array element: ");
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
}
}
// public class bubblesort {  
//     static void BubbleSort(int[] arr) {  
//         int n = arr.length;  
//         int temp = 0;  
//          for(int i=0; i < n; i++){  
//                  for(int j=1; j < (n-i); j++){  
//                           if(arr[j-1] > arr[j]){  
//                                  //swap elements  
//                                  temp = arr[j-1];  
//                                  arr[j-1] = arr[j];  
//                                  arr[j] = temp;  
//                          }  
                          
//                  }  
//          }  
  
//     }  
//     public static void main(String[] args) {  
//                 int arr[] ={3,60,35,2,45,320,5};  
                 
//                 System.out.println("Array Before Bubble Sort");  
//                 for(int i=0; i < arr.length; i++){  
//                         System.out.print(arr[i] + " ");  
//                 }  
//                 System.out.println();  
                  
//                 BubbleSort(arr);//sorting array elements using bubble sort  
                 
//                 System.out.println("Array After Bubble Sort");  
//                 for(int i=0; i < arr.length; i++){  
//                         System.out.print(arr[i] + " ");  
//                 }  
   
//         }  
// }  