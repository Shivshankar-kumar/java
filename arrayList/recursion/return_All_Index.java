package arrayList.recursion;

public class return_All_Index {
    public static void all_Index(int []arr,int idx,int key){
        //Base Case
        if(idx>=arr.length) return;
        //self Work
        if(arr[idx]==key){
            System.out.print(idx+" ");
        }
        all_Index(arr, idx+1, key);
    }
    public static void main(String[] args) {
        int arr[]={56,78,56,56,56};
         all_Index(arr, 0, 56);
    }
}
