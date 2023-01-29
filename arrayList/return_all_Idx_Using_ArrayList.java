package arrayList;
import java.util.ArrayList;
public class return_all_Idx_Using_ArrayList {
    public static ArrayList<Integer> all_idx(int[]arr,int idx,int key){
        ArrayList<Integer> ans=new ArrayList<>();
        //Base Case
        if(idx>=arr.length) return ans;
        //Self Work
        if(arr[idx]==key){
            ans.add(idx);
        }
        ArrayList<Integer> smallAns=all_idx(arr, idx+1, key);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7,8,9,8,7,7,7,};
        int key=7;
        System.out.print(all_idx(arr, 0, key)+" ");
    }
}
