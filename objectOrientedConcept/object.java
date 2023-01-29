package objectOrientedConcept;
import java.util.Scanner;
class student{
    int num;
    int num1;
public static void main(String args[]){
    student obj = new student();
    System.out.println("Enter the first Number: ");
    Scanner sc = new Scanner(System.in);
    obj.num=sc.nextInt();
    System.out.println("Enter the second Number: ");            
    obj.num1=sc.nextInt();
    System.out.print("Sum of two Number is ");
    System.out.println(obj.num+obj.num1);
}
}