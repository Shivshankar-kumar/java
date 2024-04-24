package sorting_Algorithm;

//Wap to move all zero at the last from array Element Using BubbleSort.
//Input: 67 8 0 2 0 1 0 45
//Output: 67 8 2 1 45 0 0 0 

public class moves_Zero_At_Last {
    static void using_BubbleSort(int[]arr){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int val: arr){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={67,0,2,0,8,1,0,45};
        using_BubbleSort(arr);
    }
}
