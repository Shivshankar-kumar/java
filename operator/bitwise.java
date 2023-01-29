package operator;
import java.util.Scanner;
class operator{
    int conditional(int a,int b){
        int ans= a&b;
        System.out.println(ans);
        return ans;
    }
}
public class bitwise {
    public static void main(String args[]){
        operator obj = new operator();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the expressin: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        //System.out.println(n1&n2);
        int ans=obj.conditional(n1,n2);
        System.out.println("bit wise and operation"+" " +ans);
    }
}
