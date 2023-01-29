package sorting_Algorithm;
public class bubbleSorting{

//WAP to Sorting an Element via bubble sort
//Bubble sort: Swap repeatedly two adjecent element if in wrong Order
//Input: 45 7 6 40 9
// OutPut: 6 7 9 40 45 
void printArray(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
void bubble_Sort(int [] arr,int n){
    //outer Loop
    for(int i=0; i<n-1; i++){
        //InnerLoop
        for(int j=0; j<n-i-1; j++){
            //Condition
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    printArray(arr);
}
public static void main(String[] args) {
    int arr[]={45,7,33,23,12,22};
    bubbleSorting sc=new bubbleSorting();
    
    System.out.println("Orginal Array is: ");
    sc.printArray(arr);
    System.out.println("\nSorted Element is: ");
    sc.bubble_Sort(arr, arr.length);
}
}