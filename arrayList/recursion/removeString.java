package arrayList.recursion;

import java.util.Scanner;

public class removeString {
    public static String remove(String str,char ch){
        //Base Case
        if(str.length()==0) return "";
        String ans=remove(str.substring(1),ch);
        if(str.charAt(0)!=ch){
            return str.charAt(0)+ans;
        }else{
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        System.out.println("Enter the remove character from string: ");
        String ch=sc.nextLine();
        System.out.println(remove(s, 'a'));
    }
}