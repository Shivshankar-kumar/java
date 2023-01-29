package arrayList.recursion;

import java.util.Scanner;

public class reverse_String{
    public static String reverse(String s){
        //Base Case
        if(s.length()==0) return "";
        //recursive / Sub Problem
        String ans=reverse(s.substring(1));
        return ans+s.charAt(0);
    }
    // static boolean palindrom(String str1,String str2){
    //     if(str1==str2){
    //         return true;
    //     } else{
    //     return false;
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();
        System.out.println("Before reverse: "+str);
        String ans=reverse(str);
        System.out.println("After REverse: "+ans);
    }
}