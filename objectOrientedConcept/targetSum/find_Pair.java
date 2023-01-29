package objectOrientedConcept.targetSum;

import java.util.Scanner;

public class find_Pair {
    int findPair(int arr[], int key){
        int pair=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==key)
                pair++;
            }
        }
    return pair;
}
public static void main(String [] args){
    find_Pair obj =new find_Pair();
    Scanner sc= new Scanner(System.in);
    int size,targetSum;
    System.out.println("Enter the size of Array: ");
    size=sc.nextInt();
    int []array=new int[size];
    System.out.println("Enter the "+size+" Element");
    for(int i=0; i<size; i++){
        array[i]=sc.nextInt();
    }
    System.out.print("Enter the target sum: ");
    targetSum=sc.nextInt();
    System.out.println(obj.findPair(array, targetSum));
}
}