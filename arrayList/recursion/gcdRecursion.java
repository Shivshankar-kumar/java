package arrayList.recursion;
import java.util.Scanner;
//Write A Program to find Gcd of Two Number.
/*Input: x=12,y=14
12: 1,2,3,4,6,12
14: 1,2,7,14
Here Common Divisor is=1,2
so GCD will be 2.
OutPut= 2
*/
public class gcdRecursion {

    //Without Recursion
    static int GCD(int x,int y){
        while(x%y!=0){
            int remainder=x%y;
            x=y;
            y=remainder;
        }
        return y;
    }

    //with recursion
    public static int find_Gcd(int x,int y){
        //base CAse
        if(y==0) return x;

        //Recursive function
        return find_Gcd(y, x%y);
    } 
    public static int product(int x, int y){
        //Base Case
        if(x==0 || y==0) return 0;
        if(y==1) return x;
        return product(x, (y)-1)+x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Gcd Of Two Number Is "+find_Gcd(x, y));
        System.out.println("Gcd of Two Number is= "+GCD(x, y));
    System.out.println("product is="+product(x,y));
}
}