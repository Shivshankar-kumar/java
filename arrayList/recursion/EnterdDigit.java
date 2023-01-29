package arrayList.recursion;

import java.util.Scanner;

public class EnterdDigit {
    public static int range_Of_sum(int n,int sum){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the "+n+" Number");
        for(int i=0; i<n; i++){
            int digit=sc.nextInt();
            sum+=digit;
        }
        return sum;
    }
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range Of Digit");
        int range=sc.nextInt();
        int sum=0;
        System.out.println("Enter The Digit: ");
        for(int i=0; i<range; i++){
            int value=sc.nextInt();
            sum+=value;
        }*/
        // System.out.println("Total Sum is= "+sum);
        int ans=+range_Of_sum(5, 0);
        System.out.println("Total Sum is= "+ans);
    }
}
