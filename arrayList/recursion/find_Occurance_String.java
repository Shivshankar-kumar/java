package arrayList.recursion;
/* 
public class find_Occurance_String {
//Global variable
    public static int first=-1;
    public static int last=-1;
    static void findOccurance(String str,int idx,char ch){
        //Base Case
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar=str.charAt(idx);
        if(currchar==ch){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        findOccurance(str, idx+1, ch);
    }
    public static void main(String[] args) {
        String str="aabcaadghaijkal";
        findOccurance(str, 0, 'a');        
    }
}
*/
public class find_Occurance_String{
    public static int ans=-1;
    public static int findOccurance(int[]arr,int idx,int n,int key){
        //Base case
        if(idx==n) return -1;
        //subproblem
        if(arr[idx]==key){
            ans=idx;
        }
        findOccurance(arr,idx+1,n,key);
        return ans;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,4,7,8,9,4,10};
        int n=arr.length;
        int ans=findOccurance(arr,0,n,0);
        System.out.println("Ans is="+" "+ans);
    }
}

