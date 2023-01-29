package arrayList.recursion;
//write A program to calculate table of given range......
//Example
//n=5
//k=7
//Output- 5 10 15 20 25 30 35
import java.util.Scanner;

public class tableRecursively {
    public static void calculateTable(int num, int range){
        //Base Case
        if(num==0) return;
        if(range==0) return;
        calculateTable(num, range-1);
        System.out.println(num*range);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        System.out.println("Enter the Range Of table: ");
        int range=sc.nextInt();
        calculateTable(n, range);
    }
}
