package operator;
import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Positive Number");
        int number=sc.nextInt();
        int flag=0;
        if(number==0 || number==1){
            flag=1;
        }
        for(int i=2; i<=number/2; i++){
            if(number%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(+number+" Is Prime Number");
        }else
        System.out.println(+number+" Is Not A Prime Number");
    }
}
