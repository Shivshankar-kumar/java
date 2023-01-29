package arrayList.recursion;

import java.util.Scanner;

//WAP to calculate sum of n number in alternative sequence
//1-2+3-4+5= 3
public class alternativeSum{
public static int sumOfNatural(int n){
    //Base Case
    if(n==0) return 0;
    //recursive,subproblem

    return sumOfNatural(n-1)+((n%2==0)?(-n):(n));
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter the Number: ");
    n=sc.nextInt();
    int ans=sumOfNatural(n);
    System.out.println("Total Sum is="+ans);
}
}
