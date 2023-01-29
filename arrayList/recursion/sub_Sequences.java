package arrayList.recursion;

//WAP to print all possible subsequences without using index variable to given String
//INput: "abc"
// Output: [ ,a,bc,b,c,ac,ab,abc]
public class sub_Sequences {
    public static void sq(String str,String add){
        //Base Case
        if(str.length()==0){
            System.out.println(add);
            return;
        }
        String sB=str.substring(1);
        sq(sB, add+str.charAt(0));
    sq(sB, add);
    }
    public static void main(String[] args) {
        sq("ABC","");
    }
}
