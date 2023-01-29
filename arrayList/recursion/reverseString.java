package arrayList.recursion;

//WAP to Reverse A string using recursion.
//Input "ABCD"
//OUTPUT "DCBA"

public class reverseString {
    void rev_String(String str,int idx){
        //Base Case
        if(idx==str.length()-1){
        System.out.println(str.charAt(idx));
        return;
        }
        rev_String(str, idx+1);
        System.out.println(str.charAt(idx));
    }
    public static void main(String[] args) {
        String str="ABCD";
        reverseString obj=new reverseString();
        obj.rev_String(str, 0);
    }
}
