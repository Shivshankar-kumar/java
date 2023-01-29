package arrayList.recursion;

import java.util.Scanner;

public class remove_Dublicate_String {
    public static String remove_Ocurrance(String str,int i){
        //Base case
        if(i==str.length()) return "";
        //recursive/ SubProblem
        String ans=remove_Ocurrance(str,i+1);

        //Self problem
        char curChar=str.charAt(i);
        if(str.charAt(i)!='a'){
            return curChar+ans;
        }else{
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        System.out.println(remove_Ocurrance(str, 0));
    }
}
