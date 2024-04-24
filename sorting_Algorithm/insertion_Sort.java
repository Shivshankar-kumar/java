package sorting_Algorithm;

public class insertion_Sort {
    static void insertion(int []arr){
        int n=arr.length;
        for(int i=1; i<n; i++){
            int j=i;
            while(j>0 && arr[i]<arr[j-1]){
                int temp=arr[j];
                arr[j+1]=arr[j];
                arr[j+1]=temp;
                j--;

            }
        }
    }
    public static void main(String[] args) {
        int arr[]={45,7,8,1,2,90};
        insertion(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
