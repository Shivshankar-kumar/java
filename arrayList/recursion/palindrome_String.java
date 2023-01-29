package arrayList.recursion;

import java.util.Scanner;
//WAP to check whether entered String is palindrome or not?
//Input: LEVEL
//Output: YES/ TRUE
public class palindrome_String {
    /*public static String reveString(String st){
        //BAse Case
        if(st.length()==0) return "";
        String ans=reveString(st.substring(1));
        return ans+st.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        String s=str;
        String ans=reveString(str);
        if(s.equals(ans)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
*/
    public static boolean ispalindrome(String str,int l,int r){
        //Base Case
        if(l>=r) return true;
        return (str.charAt(l)==str.charAt(r)) && ispalindrome(str, l+1, r-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String To Check palindrome Or Not ? :");
        String st=sc.nextLine();
        System.out.println(ispalindrome(st, 0, st.length()-1));
    }
}