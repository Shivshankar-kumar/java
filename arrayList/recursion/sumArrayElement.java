package arrayList.recursion;
public class sumArrayElement {
    public static int sum=0;
    public static int addArrayElement(int[]arr,int idx,int n){
        //Base case
        if(idx==n) return 0;
        //sub problem
        sum+=arr[idx];
        addArrayElement(arr, idx+1, n);
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,4,5,6,7,8,9,10};
        int n=arr.length;
        System.out.println(addArrayElement(arr, 0, n));
}
}