package objectOrientedConcept;

import java.util.Scanner;

class uniqElemnet {
static void uniqSearchElement(int []arr){
    for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[i]==arr[j]){
            arr[i]=arr[j]=0;
        }
    }  
}
for(int i=0; i<arr.length; i++){
    if(arr[i]>0)
    System.out.println(arr[i]);
}
}
public static void main(String []args) {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter the Size ");
    n=sc.nextInt();
    int []arr_1=new int [n];
    System.out.println("Enter the "+n+" Element");
    for(int i:arr_1){
    arr_1[i]=sc.nextInt();
    }
    uniqSearchElement(arr_1);
}   
}