package arrayList.recursion;
import java.util.Scanner;

//WAP To Check Whether Number is Armstrom or Not Using Recursion.
/*Input: 153
 YES
 SOLVE= 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 Hence It is Armstrom Number
 */
public class arm_Strong_Recursive{
static int pow_recursive(int x,int n){
    //Base CAse
    if(n==0) return 1;
    if(x==0) return 0;

    //Condition For Recusive 
    if(n%2==0) {
        int ans=pow_recursive(x,n/2);
        return ans*ans;
    }
    else{
        int ans=pow_recursive(x,n/2);
        return x*ans*ans;
    }
}
static int arm_Strong(int n,int d){
//Base Case
return pow_recursive(n%10, d)+ arm_Strong(n/10, d); //Recursive Function
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number to check");
    int n=sc.nextInt();
    int no_Of_Digit=0;
    int temp=n;
    /*while(temp>0){
        temp=temp/10;
        no_Of_Digit++;
    }
    int ans=arm_Strong(n, no_Of_Digit);
    if(ans==n){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }*/
    int ans =pow_recursive(n,3);
    System.out.println("power is = "+ans);
}
}