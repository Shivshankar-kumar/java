package arrayList.recursion;
//WAp To print array element using recursion.

public class printArrayElementRecursively {
    public static void printElement(int []arr,int idx,int n){
        //Base Case
        if(idx==n){
        return;
    }
    //recursive problem
    //printElement(arr, idx+1, n);//this will be reverse Element Print
    System.out.println(arr[idx]);
    printElement(arr, idx+1, n);

}
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,5,6};
    int n=arr.length;
    printElement(arr, 0, n);
}
}
