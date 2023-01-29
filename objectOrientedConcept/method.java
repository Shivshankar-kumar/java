package objectOrientedConcept;
import java.util.Scanner;
class sum {
    int add(int a,int b){
        int ans=a+b;
        return ans;
    }
}
public class method{
public static void main(String arr[]){
    sum obj1 = new sum();
    Scanner sc= new Scanner(System.in);
System.out.println("Enter the first number:");
int x=sc.nextInt();
System.out.println("Enter the second number:");
int y=sc.nextInt();
int ans=obj1.add(x,y);
System.out.println("sum is = "+ ans);
System.out.println(Math.sqrt(81));
System.out.println(Math.sqrt(12));
System.out.println(Math.ceil(4.3));
System.out.println(Math.floor(6.7));

}
}