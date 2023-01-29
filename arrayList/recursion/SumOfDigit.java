package arrayList.recursion;

public class SumOfDigit{
    public static int add_Digit(int n){
        if(n>=0 && n<=9)
        return n;
        int firstDigit=add_Digit(n/10);
        int lastDigit=n%10;
        return firstDigit+lastDigit;
       // return add_Digit(n/10)+n%10;
    }
    public static void main(String[] args) {
        System.out.println(add_Digit(12345));
    }
}
