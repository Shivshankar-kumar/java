package arrayList.recursion;

public class subSet_Sum {
    public static int sum=0;
    public static void sub_Set(int []arr,int idx,int n){
        //Base Case
        if(idx==n-1){
            //System.out.println(arr[idx]+" ");
            System.out.println(sum+" ");
        }
        System.out.println(sum+" ");
        sum+=arr[idx];
        sub_Set(arr, idx+1,n);
        sum=0;
        sub_Set(arr, idx+1, n);
        return;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int n=arr.length;
        sub_Set(arr, 0,n);
    }
}
