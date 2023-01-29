package arrayList.recursion;

public class return_Index {
    public static int find_Index(int []arr,int idx,int key){
        //Base case
        if(idx==arr.length) return -1;
        //self work
        if(arr[idx]==key) return idx;
        //recursive function/ work
        return find_Index(arr, idx+1, key);
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7,8,89,1};
        int key=89;
        System.out.println(find_Index(arr, 0, 0));
    }
}
