package operator;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int gcd_Max=-1,n1,n2;
        System.out.println("Enter The TWO Number");
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(int i=1; i<=n1 && i<=n2; i++){
            if(n1%i==0 && n2%i==0)
                gcd_Max=i;
        }
        System.out.println("GCD OF TWO NUMBER "+n1+" AND "+n2+" ="+gcd_Max);
    }
}
