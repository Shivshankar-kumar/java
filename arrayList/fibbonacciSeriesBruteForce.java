package arrayList;

import java.util.Scanner;

public class fibbonacciSeriesBruteForce {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size:");
        int n=sc.nextInt();   //1 Instruction.
        int a=0;
        int b=1;
        int c;
        for(int i=1; i<n; i++){
            c=a+b;
            a=b;
            b=c;
        System.out.print(c+" ");
        }
    }
}
