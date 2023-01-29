package arrayList.recursion;
import java.util.ArrayList;
public class return_ArrayList_SubSequences {
     static ArrayList<String>sub_Sequences(String str){
        ArrayList<String>ans=new ArrayList<>();
        //Base Case
        if(str.length()==0){
            ans.add("");
            return ans;
        }
        char curChar=str.charAt(0);
        ArrayList<String>smallAns=sub_Sequences(str.substring(1));
        //for Each loop
        for(String s:smallAns){
            ans.add(s);
            ans.add(curChar+s);
        }
        return ans;
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(sub_Sequences(str));
    }
}
/*static void f(String str,int idx,String add){
    //Base Case
    if(idx==str.length()){
        System.out.println(add);
        return;
    }
    f(str, idx+1,add+str.charAt(idx));
    f(str, idx+1, add);
}
public static void main(String[] args) {
    String str="ab";
    f(str, 0,"");
}
}
*/

