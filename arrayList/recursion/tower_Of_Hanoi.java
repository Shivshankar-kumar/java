package arrayList.recursion;

//WAP to Implement of Tower of Hinoi concept using Recursion.
//intput n=1---> A-->C
//input n=2;
//A-->B
//A-->C
//B-->C
//Consider ,if n=2, then 3times moves,if n=3,then 7 times moves
//formula will be (2^n-1)    n=3,,2^3-1=7 is fullfill.
import java.util.Scanner;

public class tower_Of_Hanoi{
void hanoiTower(int n,String source,String helper,String destination){
    //Base Case 
    if(n==1){
        System.out.println("Transfer Disk"+" "+n+" From"+" "+source+" "+"-->"+" "+destination);
        return;
    }

    //Subproblem

    hanoiTower(n-1,source,destination,helper);

    //Self Work

    System.out.println("Transfer Disk"+" "+n+" From"+" "+source+" "+"-->"+" "+destination);
    hanoiTower(n-1,helper,source,destination);
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    tower_Of_Hanoi obj=new tower_Of_Hanoi();
    System.out.println("Enter the Number Of Disc");
    int n=sc.nextInt();
    obj.hanoiTower(n, "A", "B", "C");
}
}