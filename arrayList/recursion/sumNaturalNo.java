package arrayList.recursion;

import java.util.Scanner;

//WAP to print Natural number using Recursion.

public class sumNaturalNo {
 static void print_Natural_Number(int n){
    //Base Case
    if(n==1){
      System.out.println(n);
      return;
    }
    print_Natural_Number(n-1);
    System.out.println(n);

 } 
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number:");
    int n=sc.nextInt();
    print_Natural_Number(n);
 }
}
