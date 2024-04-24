package sorting_Algorithm;
public class selection_Sort{
    static void selection(int[]arr){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            int min_idx=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            if(min_idx!=i){
                int temp=arr[i];
                arr[i]=arr[min_idx];
                arr[min_idx]=temp;
            }
    } 
}
    public static void main(String[] args) {
        int arr[]={23,4,7,90,1};
        selection(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}