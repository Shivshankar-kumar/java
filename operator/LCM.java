package operator;
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the TWo NUMBER");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int max_Div;
        max_Div=(num1>num2)?num1:num2;
        while(true){
            if(max_Div%num1==0 && max_Div%num2==0){
                System.out.println("LCM of"+" "+num1+" AND"+" "+num2+" IS"+"= "+max_Div);
                break;
            }
            max_Div++;
        }
    }
}
